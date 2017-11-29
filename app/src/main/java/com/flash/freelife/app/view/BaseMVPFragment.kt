package com.flash.freelife.app.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.flash.freelife.app.base.BaseFragment
import com.flash.freelife.app.presenter.BasePresenter

/**
 * Created by tianxiaolei on 2017/10/25.
 */
open abstract class BaseMVPFragment<out P : BasePresenter> : BaseFragment(), IBaseView {
    private lateinit var presenter: P
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
    fun getPresenter(): P {
        return presenter
    }

    override fun getContext(): Context {
        return super.getContext().applicationContext
    }

    abstract fun setPresenter(): P

}