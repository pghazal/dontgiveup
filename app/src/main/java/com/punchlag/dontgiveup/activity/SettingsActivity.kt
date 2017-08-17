package com.punchlag.dontgiveup.activity.activity

import android.os.Bundle
import android.text.format.DateFormat
import com.punchlag.dontgiveup.R
import kotlinx.android.synthetic.main.activity_settings.*
import java.util.*

class SettingsActivity : BaseActivity() {

    override fun getLayoutResId(): Int = R.layout.activity_settings

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun parseArguments() {
        // no-op
    }

    override fun configureSubviews() {
        initDaysCheckBox()
        initTimePicker()
    }

    private fun initTimePicker() {
        timePicker.setIs24HourView(DateFormat.is24HourFormat(this))
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            timePicker.hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
            timePicker.minute = Calendar.getInstance().get(Calendar.MINUTE)
        } else {
            timePicker.currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
            timePicker.currentMinute = Calendar.getInstance().get(Calendar.MINUTE)
        }
    }

    private fun initDaysCheckBox() {
        mondayCb.setOnCheckedChangeListener({ compoundButton, checked ->
            toast("monday : $checked")
        })
        tuesdayCb.setOnCheckedChangeListener({ compoundButton, checked ->
            toast("tuesday : $checked")
        })
        wednesdayCb.setOnCheckedChangeListener({ compoundButton, checked ->
            toast("wednesday : $checked")
        })
        thursdayCd.setOnCheckedChangeListener({ compoundButton, checked ->
            toast("thursday : $checked")
        })
        fridayCb.setOnCheckedChangeListener({ compoundButton, checked ->
            toast("friday : $checked")
        })
        saturdayCb.setOnCheckedChangeListener({ compoundButton, checked ->
            toast("saturday : $checked")
        })
        sundayCb.setOnCheckedChangeListener({ compoundButton, checked ->
            toast("sunday : $checked")
        })
    }
}
