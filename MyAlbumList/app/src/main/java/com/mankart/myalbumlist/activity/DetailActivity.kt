package com.mankart.myalbumlist.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.*
import androidx.cardview.widget.CardView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.mankart.myalbumlist.R
import com.mankart.myalbumlist.adapter.ListViewTrackListAdapter
import com.mankart.myalbumlist.data.AlbumData
import com.mankart.myalbumlist.data.TrackListData
import com.mankart.myalbumlist.model.Album
import com.mankart.myalbumlist.model.Track
import com.mankart.myalbumlist.model.TrackList

class DetailActivity : AppCompatActivity() {
    private val albumId: Int
        get() {
            return intent.getIntExtra(EXTRA_ALBUM_ID, 0)
        }

    private var list: ArrayList<Album> = arrayListOf()
    private var trackList: ArrayList<TrackList> = arrayListOf()

    companion object {
        const val EXTRA_ALBUM_ID = "extra_album_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        list.addAll(AlbumData.listData)
        val album = list[albumId]

        val cover: ImageView = findViewById(R.id.img_detail_cover)
        val coverBg: ImageView = findViewById(R.id.img_detail_cover_bg)
        val albumName: TextView = findViewById(R.id.tv_detail_album_name)
        val artistName: TextView = findViewById(R.id.tv_detail_artist_name)
        val genre: TextView = findViewById(R.id.tv_detail_album_genre)
        val year: TextView = findViewById(R.id.tv_detail_album_year)
        val description: TextView = findViewById(R.id.tv_detail_album_description)
        val release: TextView = findViewById(R.id.tv_detail_album_release)
        val song: TextView = findViewById(R.id.tv_detail_album_song)
        val label: TextView = findViewById(R.id.tv_detail_album_label)
        val duration: TextView = findViewById(R.id.tv_detail_album_duration)

        Glide.with(this)
            .load(album.cover)
            .apply(RequestOptions().override(400, 400))
            .into(cover)
        Glide.with(this)
            .load(album.cover)
            .apply(RequestOptions().override(400, 400))
            .into(coverBg)
        albumName.text = album.albumNames
        artistName.text = album.albumArtist
        genre.text = album.genre
        year.text = album.year
        description.text = album.description
        release.text = album.release
        song.text = album.songs.toString()
        label.text = album.label
        duration.text = album.duration

        trackList.addAll(TrackListData.listTrack)
        val listTrack = trackList[albumId]

        val list = arrayListOf<Track>()
        for (position in listTrack.songTitle.indices) {
            val track = Track()

            track.title = listTrack.songTitle[position]
            track.length = listTrack.songLength[position]

            list.add(track)
        }

        val listView: ListView = findViewById(R.id.lv_track_list)
        listView.adapter = ListViewTrackListAdapter(this, R.layout.item_list_view, list)

        val cardListView: CardView = findViewById(R.id.cv_lv)

        val params: ViewGroup.LayoutParams = cardListView.layoutParams
        params.height = 80 * list.size
        cardListView.layoutParams = params

        supportActionBar?.title = album.albumNames
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    fun onFavouriteAction(item: MenuItem) {
        if (item.itemId == R.id.btn_favourite) {
            val album = list[intent.getIntExtra(EXTRA_ALBUM_ID, 0)]
            Toast.makeText(this, "Add \"${album.albumNames}\" to Favourite", Toast.LENGTH_SHORT).show()
        }
    }
}