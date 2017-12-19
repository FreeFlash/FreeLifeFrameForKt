package com.flash.freelife.app.network

import com.flash.freelife.app.module.bean.LoginResult
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

/**
 * Created by tianxiaolei on 2017/11/29.
 */
interface FreeService {

    @POST("/token/phone")
    fun getTokenByPhone(@Field("phone") phone: String, @Field("code") code: String): Call<String>

    @POST("/token/username")
    fun getTokenByUsername(@Field("username") username: String, @Field("password") password: String): Call<LoginResult>

    @POST("/user")
    fun createUser(@Field("username") username: String, @Field("password") password: String): Call<String>
    @GET("/user")
    fun getUser(@Header("Authorization")authorization:String):Call<String>
}