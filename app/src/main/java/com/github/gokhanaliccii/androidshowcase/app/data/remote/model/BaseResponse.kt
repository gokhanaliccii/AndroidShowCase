package com.github.gokhanaliccii.androidshowcase.app.data.remote.model

import com.google.gson.annotations.SerializedName

class BaseResponse<out R> {
    @SerializedName("status")
    val status: String? = null

    @SerializedName("results")
    val results: R? = null
}
