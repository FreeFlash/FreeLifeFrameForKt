package com.flash.freelife.app.presenter.main

import com.flash.freelife.app.module.main.MainModule
import com.flash.freelife.app.presenter.BasePresenter
import com.flash.freelife.app.view.main.IMainView

/**
 * Created by tianxiaolei on 2017/10/24.
 */
open class MainPresenter(mainView: IMainView) : BasePresenter(), IMainPresenter {
    val mainView: IMainView = mainView
    val mainModule:MainModule = MainModule()

    override fun loadData(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}