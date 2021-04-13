package com.github.gokhanaliccii.androidshowcase.app.data.remote.model

import com.google.gson.annotations.SerializedName

class BookResponse {
    @SerializedName("rank")
    val rank: Int? = null

    @SerializedName("rank_last_week")
    val rankLastWeek: Int? = null

    @SerializedName("publisher")
    val publisher: String? = null

    @SerializedName("description")
    val description: String? = null

    @SerializedName("title")
    val title: String? = null

    @SerializedName("author")
    val author: String? = null

    @SerializedName("contributor")
    val contributor: String? = null

    @SerializedName("book_image")
    val bookImage: String? = null

    @SerializedName("book_image_width")
    val bookImageWidth: Int? = null

    @SerializedName("book_image_height")
    val bookImageHeight: Int? = null
}
