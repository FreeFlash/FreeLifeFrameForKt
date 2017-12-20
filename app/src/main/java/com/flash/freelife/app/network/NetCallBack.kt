package com.flash.freelife.app.network

import com.flash.freelife.app.module.bean.Result
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by tianxiaolei on 2017/12/19.
 */
abstract class NetCallBack<Data> : Callback<Result<Data>> {
    override fun onFailure(call: Call<Result<Data>>?, t: Throwable?) {
        onComplete(call)
        if (t != null) {
            t.message?.let {
                onError(ResultCode.OTHER_ERROR, it)
                return
            }
        }
        onError(ResultCode.OTHER_ERROR, "未知异常")
    }

    override fun onResponse(call: Call<Result<Data>>?, response: Response<Result<Data>>?) {
        onComplete(call)
        if (response!!.body()!!.code!! == ResultCode.OK) {
            onSuccess(response!!.body()!!.data)
            return
        }
        onError(response.body()!!.code, response.body()!!.message)
    }

    abstract fun onSuccess(data: Data)
    abstract fun onError(code: ResultCode, message: String)

    abstract fun onComplete(call: Call<Result<Data>>?)

}