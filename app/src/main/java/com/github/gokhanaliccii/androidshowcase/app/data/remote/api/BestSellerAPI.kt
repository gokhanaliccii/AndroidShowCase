package com.github.gokhanaliccii.androidshowcase.app.data.remote.api

import com.github.gokhanaliccii.androidshowcase.app.data.remote.model.BaseResponse
import com.github.gokhanaliccii.androidshowcase.app.data.remote.model.BookResponse
import com.github.gokhanaliccii.androidshowcase.app.data.remote.model.NameListResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface BestSellerAPI {


    @GET("lists/current/{category}.json")
    suspend fun getBestSellerBooks(@Path("category") category: String) : BaseResponse<List<BookResponse>>

    @GET("lists/names.json")
    suspend fun getBestSellerCategories() : BaseResponse<List<NameListResponse>>
}