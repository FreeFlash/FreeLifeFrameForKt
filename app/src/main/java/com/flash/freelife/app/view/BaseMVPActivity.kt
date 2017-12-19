package com.flash.freelife.app.view

import android.content.Context
import android.os.Bundle
import com.flash.freelife.app.base.BaseActivity
import com.flash.freelife.app.presenter.BasePresenter

open abstract class BaseMVPActivity<out P : BasePresenter> : BaseActivity(), IBaseView {

    private lateinit var presenter: P
    override fun onCreate(savedInstanceState: Bundle?) {
        presenter = setPresenter()
        presenter.attachView(this)
        super.onCreate(savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }

    abstract fun setPresenter(): P

    fun getPresenter(): P {
        return presenter
    }

    override fun getContext(): Context {
        return this.applicationContext
    }

    override fun showLoading() {
        showLoadingView()
    }

    override fun hideLoading() {
        hideLoadingView()
    }
}