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

class ListAlbumAdapter(private var listAlbum : ArrayList<Album>) : RecyclerView.Adapter<ListAlbumAdapter.ListViewHolder>() {
    private lateinit var onClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Album)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvAlbumName : TextView = itemView.findViewById(R.id.tv_album_name)
        var tvArtistName : TextView = itemView.findViewById(R.id.tv_artist_name)
        var tvAlbumYear : TextView = itemView.findViewById(R.id.tv_album_year)
        var tvGenre : TextView = itemView.findViewById(R.id.tv_genre)
        var imgCover : ImageView = itemView.findViewById(R.id.img_album_cover)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_album, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val album = listAlbum[position]

        Glide.with(holder.itemView.context)
            .load(album.cover)
            .apply(RequestOptions().override(400, 400))
            .into(holder.imgCover)
        holder.tvAlbumName.text = album.albumNames
        holder.tvAlbumYear.text = album.year
        holder.tvArtistName.text = album.albumArtist
        holder.tvGenre.text = album.genre

        holder.itemView.setOnClickListener { this.onClickCallback.onItemClicked(listAlbum[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listAlbum.size
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onClickCallback = onItemClickCallback
    }


}