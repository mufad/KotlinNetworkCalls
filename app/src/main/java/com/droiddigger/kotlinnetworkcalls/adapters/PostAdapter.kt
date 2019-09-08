package com.droiddigger.kotlinnetworkcalls.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.droiddigger.kotlinnetworkcalls.model.Movie
import com.droiddigger.kotlinnetworkcalls.model.Posts
import com.droiddigger.kotlinnetworkcalls.viewholders.MovieViewHolder
import com.droiddigger.kotlinnetworkcalls.viewholders.PostViewHolder

/**
 * @author Ja
 * @date 6/16/2019
 */
class PostAdapter(private val dataList: List<Posts>) :
    RecyclerView.Adapter<PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return PostViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post: Posts = dataList[position]
        holder.bind(post)
    }

}