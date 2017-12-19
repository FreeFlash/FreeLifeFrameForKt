package com.flash.freelife.app.module.bean

import com.flash.freelife.app.network.ResultCode

/**
 * Created by tianxiaolei on 2017/12/1.
 */
class Result<Data>(var data: Data) {
    lateinit var code:ResultCode
    lateinit var details:String
    lateinit var message:String
}