package com.droiddigger.kotlinnetworkcalls.viewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.droiddigger.kotlinnetworkcalls.R
import com.droiddigger.kotlinnetworkcalls.model.Movie

/**
 * @author Ja
 * @date 6/16/2019
 */
class MovieViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_offline_list, parent,false)) {
    private var tvTitle: TextView? = null
    private var tvYear: TextView? = null

    init {
        tvTitle = itemView.findViewById(R.id.list_title)
        tvYear = itemView.findViewById(R.id.list_description)
    }

    fun bind(movie: Movie) {
        tvTitle?.text = movie.title
        tvYear?.text = movie.year.toString()

    }
}
