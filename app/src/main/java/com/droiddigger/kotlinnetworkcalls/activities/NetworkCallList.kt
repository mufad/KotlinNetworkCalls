package com.droiddigger.kotlinnetworkcalls.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.droiddigger.kotlinnetworkcalls.R

class NetworkCallList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()

    }

    private fun initViews() {

        setContentView(R.layout.activity_network_call_list)
        setTitle(R.string.online_title)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
