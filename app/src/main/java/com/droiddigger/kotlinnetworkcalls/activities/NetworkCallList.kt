package com.droiddigger.kotlinnetworkcalls.activities

import android.os.Bundle
import android.os.RecoverySystem
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.droiddigger.kotlinnetworkcalls.R
import com.droiddigger.kotlinnetworkcalls.adapters.MovieAdapter
import com.droiddigger.kotlinnetworkcalls.adapters.PostAdapter
import com.droiddigger.kotlinnetworkcalls.model.Posts
import com.droiddigger.kotlinnetworkcalls.network.ApiInterface
import com.droiddigger.kotlinnetworkcalls.network.RetrofitClient
import kotlinx.android.synthetic.main.activity_network_call_list.*
import kotlinx.android.synthetic.main.activity_offline_list.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NetworkCallList : AppCompatActivity() {

    lateinit var mPostRecyclerView: RecyclerView
    var dataList = ArrayList<Posts>()
    var progressBar: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
        initFunctionalities()
        getData()

    }

    private fun initViews() {

        setContentView(R.layout.activity_network_call_list)
        setTitle(R.string.online_title)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        mPostRecyclerView = findViewById(R.id.rvOnlineList)
        progressBar = findViewById(R.id.pbLoader)
    }

    private fun initFunctionalities() {
        mPostRecyclerView.adapter = PostAdapter(dataList)
        mPostRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun getData() {
        var networkCall: Call<List<Posts>> = RetrofitClient.getClient.getPosts()
        networkCall.enqueue(object : Callback<List<Posts>> {

            override fun onResponse(call: Call<List<Posts>>?, response: Response<List<Posts>>?) {
                progressBar?.visibility = View.GONE
                dataList.addAll(response!!.body()!!)
                rvOnlineList.adapter?.notifyDataSetChanged()
            }

            override fun onFailure(call: Call<List<Posts>>?, t: Throwable?) {
                Toast.makeText(this@NetworkCallList, "Network Call Failed", Toast.LENGTH_SHORT)
                    .show()
            }

        })
    }
}
