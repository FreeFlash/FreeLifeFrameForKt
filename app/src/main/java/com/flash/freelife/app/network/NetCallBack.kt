package com.flash.freelife.app.network

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by tianxiaolei on 2017/12/19.
 */
abstract class NetCallBack<T> : Callback<T> {
    override fun onFailure(call: Call<T>?, t: Throwable?) {
        onComplete(call)
        onError(t)
    }

    override fun onResponse(call: Call<T>?, response: Response<T>?) {
        onComplete(call)
        onSuccess(response)
    }

    abstract fun onSuccess(response: Response<T>?)
    abstract fun onError(t: Throwable?)

    abstract fun onComplete(call: Call<T>?)

}