package com.github.gokhanaliccii.androidshowcase.app.data.remote.api.interceptor

import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor(private val apiKey: String) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val newUrl = chain.request()
            .url
            .newBuilder()
            .addQueryParameter(API_KEY, apiKey)
            .build()

        val request = chain.request()
            .newBuilder()
            .url(newUrl)
            .build()

        return chain.proceed(request)
    }

    companion object {
        private const val API_KEY = "api-key"
    }
}