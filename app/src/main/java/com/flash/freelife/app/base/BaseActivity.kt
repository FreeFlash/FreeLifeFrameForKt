package com.flash.freelife.app.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.toast

open abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.setContentView(setLayoutId())
        initView()
        initData()
    }

    abstract fun setLayoutId(): Int
    abstract fun initView()
    abstract fun initData()
    fun showLoadingView() {

    }

    fun hideLoadingView() {

    }

    fun showHint(message: String) {
        toast(message)
    }
}
