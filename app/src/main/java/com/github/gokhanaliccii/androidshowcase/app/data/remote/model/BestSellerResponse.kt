package com.github.gokhanaliccii.androidshowcase.app.data.remote.model

import com.google.gson.annotations.SerializedName

class BestSellerResponse {
    @SerializedName("list_name")
    val listName: String? = null

    @SerializedName("list_name_encoded")
    val listNameEncoded: String? = null

    @SerializedName("bestsellers_date")
    val bestsellersDate: String? = null

    @SerializedName("published_date")
    val publishedDate: String? = null

    @SerializedName("display_name")
    val displayName: String? = null

    @SerializedName("books")
    val books: List<BookResponse>? = null
}
