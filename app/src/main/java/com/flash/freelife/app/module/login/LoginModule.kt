package com.flash.freelife.app.module.login

import com.flash.freelife.app.module.BaseModule
import com.flash.freelife.app.module.ModuleCallBack
import com.flash.freelife.app.module.ModuleCode
import com.flash.freelife.app.module.bean.LoginResult
import com.flash.freelife.app.module.bean.Result
import com.flash.freelife.app.network.ApiClient
import com.flash.freelife.app.network.NetCallBack
import com.flash.freelife.app.network.ResultCode
import retrofit2.Call

/**
 * Created by tianxiaolei on 2017/12/1.
 */
class LoginModule : BaseModule() {
    fun loginByUsername(username: String, password: String, callback: ModuleCallBack<LoginResult>) {
        val call = ApiClient.freeService.getTokenByUsername(username, password);
        addCall(call)
        call.enqueue(object : NetCallBack<LoginResult>() {
            override fun onSuccess(data: LoginResult) {
                callback.onSuccess(data)
            }

            override fun onError(code: ResultCode, message: String) {
                callback.onFailure(ModuleCode.FAILED, message)
            }

            override fun onComplete(call: Call<Result<LoginResult>>?) {
                if (call != null) {
                    removeCall(call)
                }
                callback.onComplete()
            }
        })
    }

}