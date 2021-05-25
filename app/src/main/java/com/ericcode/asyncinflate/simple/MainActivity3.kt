package com.ericcode.asyncinflate.simple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ericcode.asyncinflate.AsyncInflateManager

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AsyncInflateManager.getInstance()
            .setContentView(
                this,
                AsyncInflateUtil.InflateKey.KEY_3,
                R.layout.activity_main3
            )
    }
}