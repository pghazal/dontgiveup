package com.punchlag.dontgiveup.activity.activity

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

abstract class BaseActivity : AppCompatActivity() {
    abstract fun getLayoutResId(): Int

    abstract fun parseArguments()

    abstract fun configureSubviews()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())
        parseArguments()
        configureSubviews()


    }

    fun Context.toast(text: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, text, duration).show()
    }
}
