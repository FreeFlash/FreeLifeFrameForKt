package com.flash.freelife.app.navigation

import android.app.Activity
import android.content.Context
import android.content.Intent

/**
 * Created by tianxiaolei on 2017/12/20.
 */
class IntentBuilder {
    var intent: Intent? = null
    fun createIntent(context: Context, clazz: Class<out Activity>): IntentBuilder {
        intent = Intent(context, clazz)
        intent!!.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        return this
    }

    fun createIntent(context: Activity, clazz: Class<out Activity>): IntentBuilder {
        intent = Intent(context, clazz)
        return this
    }

    fun putString(key:String,value:String){
        intent?.putExtra(key,value)
    }

    fun putInt(key: String,value:Int){
        intent?.putExtra(key,value)
    }

    fun addFlags(flags:Int){
        intent?.addFlags(flags)
    }

    fun build(): Intent? {
        return intent
    }
}
