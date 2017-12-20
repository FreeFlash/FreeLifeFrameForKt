package com.flash.freelife.app.presenter

import android.content.Context
import com.flash.freelife.app.module.BaseModule
import com.flash.freelife.app.view.IBaseView

/**
 * Created by tianxiaolei on 2017/10/24.
 */
open abstract class BasePresenter {
    var baseView: IBaseView? = null

    private val modules = mutableListOf<BaseModule>()

    open fun attachView(baseView: IBaseView) {
        this.baseView = baseView
    }

    fun detachView() {
        modules.forEach { module ->
            module.cancelNetWok()
        }
        baseView = null
    }

    fun addModule(module: BaseModule) {
        modules.add(module)
    }

    fun getContext(): Context? {
        return baseView?.getContext()
    }

    inline fun <reified V : IBaseView> getView(): V? {
        if (baseView == null) {
            return null
        }
        if (baseView is V) {
            return baseView as V
        }
        return null
    }

}