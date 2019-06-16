package com.droiddigger.kotlinnetworkcalls.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.droiddigger.kotlinnetworkcalls.R
import com.droiddigger.kotlinnetworkcalls.adapters.MovieAdapter
import com.droiddigger.kotlinnetworkcalls.model.Movie
import kotlinx.android.synthetic.main.activity_offline_list.*


class OfflineList : AppCompatActivity() {
    var mListRecyclerView: RecyclerView? = null
    var mAdapter: MovieAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initViews()
        initFunctionalities()

    }

    private fun initViews() {

        setContentView(R.layout.activity_offline_list)
        setTitle(R.string.offline_title)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }


    val mNicolasCageMovies = listOf(
        Movie("Raising Arizona", 1987),
        Movie("Vampire's Kiss", 1988),
        Movie("Con Air", 1997),
        Movie("Gone in 60 Seconds", 1997),
        Movie("National Treasure", 2004),
        Movie("The Wicker Man", 2006),
        Movie("Ghost Rider", 2007),
        Movie("Knowing", 2009),
        Movie("National Treasure", 2004),
        Movie("The Wicker Man", 2006),
        Movie("Ghost Rider", 2007),
        Movie("Knowing", 2009)
    )

    private fun initFunctionalities() {
        rvOfflineList.apply {
            layoutManager = LinearLayoutManager(this@OfflineList)
            adapter = MovieAdapter(mNicolasCageMovies)
        }
    }
}
