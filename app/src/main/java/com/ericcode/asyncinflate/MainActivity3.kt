package com.ericcode.asyncinflate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var inflatedView = AsyncInflateManager
            .getInstance()
            .getInflatedView(
                this,
                AsyncInflateUtil.InflateKey.KEY_3,
                R.layout.activity_main3,
                null,
                layoutInflater
            )
        setContentView(inflatedView)
    }
}