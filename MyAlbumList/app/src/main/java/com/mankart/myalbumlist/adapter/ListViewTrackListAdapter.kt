package com.mankart.myalbumlist.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.mankart.myalbumlist.R
import com.mankart.myalbumlist.model.Track

class ListViewTrackListAdapter(var myContext: Context, var resources: Int, var items: ArrayList<Track>) : ArrayAdapter<Track>(myContext, resources, items) {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(myContext)
        val view: View = layoutInflater.inflate(resources, parent, false)

        val tvTrackNumber: TextView = view.findViewById(R.id.tv_track_number)
        val tvTrackTitle: TextView = view.findViewById(R.id.tv_track_title)
        val tvTrackLength: TextView = view.findViewById(R.id.tv_track_length)

        val mItem: Track = items[position]
        tvTrackTitle.text = mItem.title
        tvTrackLength.text = mItem.length
        tvTrackNumber.text = (position + 1).toString()

        return view
    }

}