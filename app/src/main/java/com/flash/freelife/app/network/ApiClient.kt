package com.flash.freelife.app.network

import com.flash.freelife.BuildConfig
import com.google.gson.Gson
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


/**
 * Created by tianxiaolei on 2017/12/1.
 */
object ApiClient {
    val BASE_URL = "http://localhost:8080/api/v1/"
    val TIME_OUT: Long = 10
    val retrofit = initRetrofit()

    private fun initRetrofit(): Retrofit {
        val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(initOkClient())
                .addConverterFactory(GsonConverterFactory.create(Gson()))
                .build()
        return retrofit;
    }

    val freeService = initService()


    private fun initOkClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
        builder.connectTimeout(TIME_OUT, TimeUnit.SECONDS)
                .readTimeout(TIME_OUT, TimeUnit.SECONDS)
                .addInterceptor(createLoggingInterceptor())
        return builder.build()
    }

    private fun createLoggingInterceptor(): Interceptor {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE)
        return loggingInterceptor
    }

    private fun initService(): FreeService {

        return retrofit.create(FreeService::class.java)
    }


}