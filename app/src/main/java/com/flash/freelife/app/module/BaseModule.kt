package com.flash.freelife.app.module

import retrofit2.Call

/**
 * Created by tianxiaolei on 2017/11/29.
 */
abstract class BaseModule {
     private val callpool = mutableListOf<Call<*>>()

     fun cancelNetWok(){
          callpool.forEach { call ->
               call.cancel()
          }
     }

     fun addCall(call: Call<*>) {
          callpool.add(call)
     }

     fun removeCall(call: Call<*>) {
          callpool.remove(call)
     }
}