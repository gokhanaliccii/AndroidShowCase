package com.github.gokhanaliccii.androidshowcase.app.data

sealed class Result<out R> {

    data class Success<out T>(val data: T) : Result<T>()
    data class Error(val exception: Exception) : Result<Nothing>()
}

val Result<*>.isSucceeded
    get() = this is Result.Success && data != null

val Result<*>.isFailed
    get() = this is Result.Error
