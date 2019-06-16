package com.droiddigger.kotlinnetworkcalls.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.droiddigger.kotlinnetworkcalls.model.Movie
import com.droiddigger.kotlinnetworkcalls.viewholders.MovieViewHolder

/**
 * @author Ja
 * @date 6/16/2019
 */
class MovieAdapter(private val dataList: List<Movie>) :
    RecyclerView.Adapter<MovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie: Movie = dataList[position]
        holder.bind(movie)
    }

}