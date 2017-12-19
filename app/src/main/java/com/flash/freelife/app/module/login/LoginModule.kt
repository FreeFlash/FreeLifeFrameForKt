package com.flash.freelife.app.module.login

import com.flash.freelife.app.module.BaseModule
import com.flash.freelife.app.module.ModuleCallBack
import com.flash.freelife.app.module.bean.LoginResult
import com.flash.freelife.app.network.ApiClient
import com.flash.freelife.app.network.NetCallBack
import retrofit2.Call
import retrofit2.Response

/**
 * Created by tianxiaolei on 2017/12/1.
 */
class LoginModule : BaseModule() {
    fun loginByUsername(username: String, password: String, callback: ModuleCallBack<LoginResult>) {
        val call = ApiClient.freeService.getTokenByUsername(username, password);
        addCall(call)
        call.enqueue(object : NetCallBack<LoginResult>() {
            override fun onSuccess(response: Response<LoginResult>?) {
                    response?.body()?.let { callback.onSuccess(it) }
            }

            override fun onError(t: Throwable?) {

            }

            override fun onComplete(call: Call<LoginResult>?) {
                call?.let { removeCall(it) }
                callback.onComplete()
            }
        })
    }

}