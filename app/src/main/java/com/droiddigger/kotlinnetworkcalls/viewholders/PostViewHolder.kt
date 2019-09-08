package com.droiddigger.kotlinnetworkcalls.viewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.droiddigger.kotlinnetworkcalls.R
import com.droiddigger.kotlinnetworkcalls.model.Movie
import com.droiddigger.kotlinnetworkcalls.model.Posts

/**
 * @author Ja
 * @date 6/16/2019
 */
class PostViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_post_list, parent,false)) {
    private var tvPostTitle: TextView? = null
    private var tvPostDetails: TextView? = null

    init {
        tvPostTitle = itemView.findViewById(R.id.tv_post_title)
        tvPostDetails = itemView.findViewById(R.id.tv_post_details)
    }

    fun bind(posts: Posts) {
        tvPostTitle?.text = posts.title
        tvPostDetails?.text = posts.body

    }
}
