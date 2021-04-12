package com.github.gokhanaliccii.androidshowcase.app.data.remote.model

class BaseResponse<out R>(){
    val status : String? = null
    val results : R? = null
}