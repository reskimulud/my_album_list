package com.mankart.myalbumlist.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mankart.myalbumlist.R

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.title = "About Me"
    }
}