package com.droiddigger.kotlinnetworkcalls.network

import com.droiddigger.kotlinnetworkcalls.model.Posts
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET(HttpParams.API_POST)
    fun getPosts(): Call<List<Posts>>
}