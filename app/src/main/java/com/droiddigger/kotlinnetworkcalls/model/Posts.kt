package com.droiddigger.kotlinnetworkcalls.model

import com.google.gson.annotations.SerializedName

data class Posts(
    @SerializedName("userId")
    var userId: Int,
    @SerializedName("id")
    var id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("body")
    val body: String
)