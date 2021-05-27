package com.mankart.myalbumlist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.mankart.myalbumlist.model.Album
import com.mankart.myalbumlist.R
import com.mankart.myalbumlist.adapter.GridAlbumAdapter.GridViewHolder

class GridAlbumAdapter(private val listAlbum: ArrayList<Album>) : RecyclerView.Adapter<GridViewHolder>() {
    private lateinit var onClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Album)
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var cover: ImageView = itemView.findViewById(R.id.img_album_cover_grid)
        var albumName: TextView = itemView.findViewById(R.id.tv_album_name_grid)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_grid_album, parent, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listAlbum[position].cover)
            .apply(RequestOptions().override(400, 400))
            .into(holder.cover)
        holder.albumName.text = listAlbum[position].albumNames

        holder.itemView.setOnClickListener { this.onClickCallback.onItemClicked(listAlbum[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listAlbum.size
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onClickCallback = onItemClickCallback
    }
}