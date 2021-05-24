package com.ericcode.asyncinflate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var inflatedView = AsyncInflateManager
            .getInstance()
            .getInflatedView(
                this,
                AsyncInflateUtil.InflateKey.KEY_2,
                R.layout.activity_main2,
                null,
                layoutInflater
            )
        setContentView(inflatedView)
    }
}