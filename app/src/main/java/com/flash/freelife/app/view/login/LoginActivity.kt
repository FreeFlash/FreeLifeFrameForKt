package com.flash.freelife.app.view.login

import android.text.TextUtils
import android.view.View
import com.flash.freelife.R
import com.flash.freelife.app.presenter.login.LoginPresenter
import com.flash.freelife.app.view.BaseMVPActivity
import kotlinx.android.synthetic.main.activity_login.*

/**
 * Created by tianxiaolei on 2017/12/18.
 */
class LoginActivity : BaseMVPActivity<LoginPresenter>(), ILoginView, View.OnClickListener {
    override fun loginFail(message: String) {

    }

    override fun loginSuccess() {
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button_login -> checkLoginParams()
        }
    }

    private fun checkLoginParams() {
        if (TextUtils.isEmpty(textInputEditText_account.text.toString())) {

        }
        if(TextUtils.isEmpty(textInputEditText_password.text.toString())){

        }
    }

    override fun setLayoutId(): Int {
        return R.layout.activity_login
    }

    override fun initView() {
        button_login.setOnClickListener(this)
    }

    override fun initData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setPresenter(): LoginPresenter {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}