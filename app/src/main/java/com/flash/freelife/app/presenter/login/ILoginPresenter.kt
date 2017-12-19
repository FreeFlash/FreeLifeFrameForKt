package com.flash.freelife.app.presenter.login

import com.flash.freelife.app.module.ModuleCallBack
import com.flash.freelife.app.module.bean.LoginResult

/**
 * Created by tianxiaolei on 2017/12/18.
 */
interface ILoginPresenter {
    fun login(account: String, password: String)
}