package com.flash.freelife.app.presenter

import android.content.Context
import com.flash.freelife.app.view.IBaseView

/**
 * Created by tianxiaolei on 2017/10/24.
 */
open abstract class BasePresenter {
    private lateinit var baseView: IBaseView
    open fun attachView(baseView: IBaseView) {
        this.baseView = baseView
    }

    abstract fun detachView()

    fun getContext(): Context {
        return baseView.getContext()
    }
}