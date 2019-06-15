package com.droiddigger.kotlinnetworkcalls.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.droiddigger.kotlinnetworkcalls.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
        initListeners()
    }

    private fun initViews() {

        setContentView(R.layout.activity_main)
    }

    private fun initListeners() {
        btnStartOfflineActivity.setOnClickListener {
            val intent = Intent(this, OfflineList::class.java)
            startActivity(intent)
        }


        btnStartOnlineActivity.setOnClickListener {
            val intent = Intent(this, NetworkCallList::class.java)
            startActivity(intent)
        }
    }


}
