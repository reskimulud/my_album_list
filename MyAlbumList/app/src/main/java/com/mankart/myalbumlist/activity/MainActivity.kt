package com.mankart.myalbumlist.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mankart.myalbumlist.R
import com.mankart.myalbumlist.adapter.GridAlbumAdapter
import com.mankart.myalbumlist.adapter.ListAlbumAdapter
import com.mankart.myalbumlist.data.AlbumData
import com.mankart.myalbumlist.model.Album

class MainActivity : AppCompatActivity() {
    private lateinit var rvAlbums: RecyclerView
    private var list: ArrayList<Album> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAlbums = findViewById(R.id.rv_albums)
        rvAlbums.setHasFixedSize(true)

        list.addAll(AlbumData.listData)
        showRecycleList()
    }

    private fun showRecycleList() {
        rvAlbums.layoutManager = LinearLayoutManager(this)
        val listAlbumAdapter = ListAlbumAdapter(list)
        rvAlbums.adapter = listAlbumAdapter

        listAlbumAdapter.setOnItemClickCallback(object: ListAlbumAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Album) {
                showSelectedAlbum(data)
            }
        })
    }

    private fun showRecycleGrid() {
        rvAlbums.layoutManager = GridLayoutManager(this, 2)
        val gridAlbumAdapter = GridAlbumAdapter(list)
        rvAlbums.adapter = gridAlbumAdapter

        gridAlbumAdapter.setOnItemClickCallback(object: GridAlbumAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Album) {
                showSelectedAlbum(data)
            }
        })
    }

    private fun showSelectedAlbum(album: Album) {
        val moveIntent = Intent(this@MainActivity, DetailActivity::class.java)
        moveIntent.putExtra(DetailActivity.EXTRA_ALBUM_ID, album.id)
        startActivity(moveIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    fun onAboutAction(item: MenuItem) {
        when (item.itemId) {
            R.id.btn_about -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_grid -> {
                if (!item.isChecked) {
                    item.setIcon(R.drawable.ic_list)
                    showRecycleGrid()
                    item.isChecked = true
                    Toast.makeText(this, "Grid View", Toast.LENGTH_SHORT).show()
                } else {
                    item.setIcon(R.drawable.ic_grid)
                    showRecycleList()
                    item.isChecked = false
                    Toast.makeText(this, "List View", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}