package com.punchlag.dontgiveup.activity.activity

import android.content.Intent
import android.os.Bundle
import com.punchlag.dontgiveup.R

class MainActivity : BaseActivity() {

    override fun getLayoutResId(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(Intent(this, SettingsActivity::class.java))
    }

    override fun parseArguments() {
        // no-op
    }

    override fun configureSubviews() {
        // no-op
    }
}