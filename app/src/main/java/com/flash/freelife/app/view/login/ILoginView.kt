package com.flash.freelife.app.view.login

import com.flash.freelife.app.view.IBaseView

/**
 * Created by tianxiaolei on 2017/12/18.
 */
interface ILoginView : IBaseView {
    fun loginSuccess()
    fun loginFail(message:String)
}