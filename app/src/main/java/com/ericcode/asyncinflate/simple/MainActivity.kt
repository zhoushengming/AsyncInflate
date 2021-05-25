package com.ericcode.asyncinflate.simple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AsyncInflateUtil.startTask(application)

    }

    fun click(view: View) {
        when (view.id) {
            R.id.btn1 -> startActivity(Intent(this, MainActivity2::class.java))
            R.id.btn2 -> startActivity(Intent(this, MainActivity3::class.java))
        }
    }
}