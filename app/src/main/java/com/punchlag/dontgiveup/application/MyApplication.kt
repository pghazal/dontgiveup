package com.punchlag.dontgiveup.application

import android.app.Application
import com.punchlag.dontgiveup.delegate.DelegatesExt

class MyApplication : Application() {
    companion object {
        var instance: MyApplication by DelegatesExt.nonNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}