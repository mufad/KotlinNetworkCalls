package com.droiddigger.kotlinnetworkcalls.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.droiddigger.kotlinnetworkcalls.R

class OfflineList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {

        setContentView(R.layout.activity_offline_list)
        setTitle(R.string.offline_title)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
