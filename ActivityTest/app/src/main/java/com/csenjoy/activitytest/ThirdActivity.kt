package com.csenjoy.activitytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ThirdActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_layout)
    }
}