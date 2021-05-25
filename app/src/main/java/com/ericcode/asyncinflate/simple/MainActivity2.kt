package com.ericcode.asyncinflate.simple

import android.content.MutableContextWrapper
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ericcode.asyncinflate.AsyncInflateManager

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var inflatedView = AsyncInflateManager.getInstance()
            .getInflatedView(
                this,
                AsyncInflateUtil.InflateKey.KEY_2,
                R.layout.activity_main2,
                null,
                layoutInflater
            )
        setContentView(inflatedView)
        var findViewById: TextView = findViewById(R.id.tv1)
        var context = findViewById.context
        Log.i("zsm", "context is $context")
        if (context is MutableContextWrapper) {
            var baseContext = context.baseContext
            Log.i("zsm", "baseContext is $baseContext")
        }
    }
}