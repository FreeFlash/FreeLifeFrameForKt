package com.flash.freelife.app.view.login

import android.app.Activity
import android.content.Context
import android.text.TextUtils
import android.view.View
import com.flash.freelife.R
import com.flash.freelife.app.navigation.IntentBulider
import com.flash.freelife.app.presenter.login.LoginPresenter
import com.flash.freelife.app.view.BaseMVPActivity
import kotlinx.android.synthetic.main.activity_login.*

/**
 * Created by tianxiaolei on 2017/12/18.
 */
class LoginActivity : BaseMVPActivity<LoginPresenter>(), ILoginView, View.OnClickListener {
    companion object {
        fun start(context: Activity){
            context.startActivity(IntentBulider().createIntent(context,LoginActivity::class.java).build())
        }
        fun start(context: Context){
            context.startActivity(IntentBulider().createIntent(context,LoginActivity::class.java).build())
        }
    }
    override fun loginFail(message: String) {
        showHint(message)
    }

    override fun loginSuccess() {
        showHint("login success")
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button_login -> checkLoginParams()
        }
    }

    private fun checkLoginParams() {
        val account = textInputEditText_account.text.toString()
        if (TextUtils.isEmpty(account)) {
            showHint("account not allow null!")
            return
        }
        val password = textInputEditText_password.text.toString()
        if (TextUtils.isEmpty(password)) {
            showHint("password not allow null!")
            return
        }
        getPresenter().login(account, password)
    }

    override fun setLayoutId(): Int {
        return R.layout.activity_login
    }

    override fun initView() {
        button_login.setOnClickListener(this)
    }

    override fun initData() {
//        todo
    }

    override fun setPresenter(): LoginPresenter {
        return LoginPresenter()
    }
}