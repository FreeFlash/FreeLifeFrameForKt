package com.flash.freelife.app.presenter.login

import com.flash.freelife.app.module.ModuleCallBack
import com.flash.freelife.app.module.ModuleCode
import com.flash.freelife.app.module.bean.LoginResult
import com.flash.freelife.app.module.login.LoginModule
import com.flash.freelife.app.presenter.BasePresenter
import com.flash.freelife.app.view.login.ILoginView


/**
 * Created by tianxiaolei on 2017/12/18.
 */
class LoginPresenter : BasePresenter(), ILoginPresenter {
    override fun login(account: String, password: String) {
        baseView?.showLoading()
        loginModule.loginByUsername(account, password, object : ModuleCallBack<LoginResult>() {
            override fun onSuccess(t: LoginResult) {
                getView<ILoginView>()?.loginSuccess()
            }

            override fun onFailure(code: ModuleCode, message: String) {
                getView<ILoginView>()?.loginFail(message)
            }

            override fun onComplete() {
                baseView?.hideLoading()
            }
        })
    }

    val loginModule = LoginModule()

    init {
        addModule(loginModule)
    }

}