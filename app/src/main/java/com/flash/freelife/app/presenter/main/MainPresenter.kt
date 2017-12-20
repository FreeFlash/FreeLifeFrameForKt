package com.flash.freelife.app.presenter.main

import com.flash.freelife.app.module.main.MainModule
import com.flash.freelife.app.presenter.BasePresenter
import com.flash.freelife.app.view.main.IMainView

/**
 * Created by tianxiaolei on 2017/10/24.
 */
open class MainPresenter() : BasePresenter(), IMainPresenter {
    val mainModule:MainModule = MainModule()

    override fun loadData(){
        getView<IMainView>()?.loadData()
    }

}