package com.github.gokhanaliccii.androidshowcase.app.data.remote.model

import com.google.gson.annotations.SerializedName

class NameListResponse {
    @SerializedName("list_name")
    val listName: String? = null

    @SerializedName("display_name")
    val displayName: String? = null

    @SerializedName("list_name_encoded")
    val listNameEncoded: String? = null

    @SerializedName("oldest_published_date")
    val oldestPublishedDate: String? = null

    @SerializedName("newest_published_date")
    val newestPublishedDate: String? = null

    @SerializedName("updated")
    val updated: String? = null
}
