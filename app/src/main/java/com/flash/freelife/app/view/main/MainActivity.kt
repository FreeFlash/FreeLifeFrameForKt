package com.flash.freelife.app.view.main

import com.flash.freelife.R
import com.flash.freelife.app.presenter.main.MainPresenter
import com.flash.freelife.app.view.BaseMVPActivity

class MainActivity : BaseMVPActivity<MainPresenter>(), IMainView {
    override fun loadData(): String {
        //To change body of created functions use File | Settings | File Templates.
        return ""
    }

    override fun setLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        //To change body of created functions use File | Settings | File Templates.
    }

    override fun initData() {
        //To change body of created functions use File | Settings | File Templates.
    }

    override fun setPresenter(): MainPresenter {
        return MainPresenter()
    }

    fun test(){
        getPresenter().loadData()
    }

}
