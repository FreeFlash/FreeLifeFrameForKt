package com.flash.freelife.app.network

import com.flash.freelife.app.module.bean.LoginResult
import com.flash.freelife.app.module.bean.Result
import retrofit2.Call
import retrofit2.http.*

/**
 * Created by tianxiaolei on 2017/11/29.
 */
interface FreeService {

    @FormUrlEncoded
    @POST("token/phone")
    fun getTokenByPhone(@Field("phone") phone: String, @Field("code") code: String): Call<String>

    @FormUrlEncoded
    @POST("token/username")
    fun getTokenByUsername(@Field("username") username: String, @Field("password") password: String): Call<Result<LoginResult>>

    @FormUrlEncoded
    @POST("user")
    fun createUser(@Field("username") username: String, @Field("password") password: String): Call<String>
    @GET("user")
    fun getUser(@Header("Authorization")authorization:String):Call<String>
}