package com.flash.freelife.app.module

/**
 * Created by tianxiaolei on 2017/12/19.
 */
abstract class ModuleCallBack<in Data> {
    abstract fun onSuccess(t: Data)
    abstract fun onFailure(code: ModuleCode, message: String)
    abstract fun onComplete()
}