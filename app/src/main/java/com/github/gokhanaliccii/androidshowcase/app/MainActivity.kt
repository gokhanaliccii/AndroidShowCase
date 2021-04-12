package com.github.gokhanaliccii.androidshowcase.app

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.github.gokhanaliccii.androidshowcase.app.data.remote.BestSellerService
import com.github.gokhanaliccii.androidshowcase.app.data.remote.api.interceptor.ApiKeyInterceptor
import com.github.gokhanaliccii.androidshowcase.app.databinding.ActivityMainBinding
import kotlinx.coroutines.*
import okhttp3.logging.HttpLoggingInterceptor

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

     private val scope = MainScope()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val apiKeyInterceptor = ApiKeyInterceptor(BuildConfig.NY_TIMES_API_KEY)
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val bestSellerService = BestSellerService(interceptors =  listOf(apiKeyInterceptor, httpLoggingInterceptor))

        scope.launch {
            withContext(Dispatchers.IO){
                bestSellerService.bestSellerAPI.getBestSellerCategories()?.let {
                    Log.i(TAG, "data fetched ${it.results?.size}")
                }
            }
        }
    }

    override fun onStop() {
        super.onStop()
        scope.cancel()
    }

    companion object{
        const val TAG = "MainActivity"
    }
}