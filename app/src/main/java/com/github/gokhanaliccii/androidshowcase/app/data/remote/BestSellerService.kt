package com.github.gokhanaliccii.androidshowcase.app.data.remote

import com.github.gokhanaliccii.androidshowcase.app.data.remote.api.BestSellerAPI
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


private const val BASE_URL = "https://api.nytimes.com/svc/books/v3/"

class BestSellerService(
    private val apiUrl: String = BASE_URL,
    private val interceptors: List<Interceptor>
) {

    private fun getRetrofit(httpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(apiUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient)
            .build()
    }

    private fun okhttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS).apply {
                interceptors.forEach { addInterceptor(it) }
            }
            .build()
    }

    val bestSellerAPI: BestSellerAPI = getRetrofit(okhttpClient()).create(BestSellerAPI::class.java)
}