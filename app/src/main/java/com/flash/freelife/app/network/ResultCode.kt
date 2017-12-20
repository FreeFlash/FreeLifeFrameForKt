package com.flash.freelife.app.network

/**
 * Created by tianxiaolei on 2017/12/1.
 */
enum class ResultCode {
    /**
     * 请求成功
     */
    OK,
    /**
     * 请求失败
     */
    FAILED,
    /**
     * 服务器错误
     */
    SERVER_ERROR,
    /**
     * 没有权限
     */
    NO_PERMISSIONS,
    /**
     * 频繁调用
     */
    INVOKE_FAST,
    /**
     * Token失效
     */
    TOKEN_INVALID,
    /**
     * 其他错误，包括本地
     */
    OTHER_ERROR
}