package com.example.bookarle.views.activities

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bookarle.R

class WelcomeActivity : AppCompatActivity() {

    private val splashTimeOut : Long = 3000

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_welcome)
        Handler(Looper.getMainLooper()).postDelayed({

        }, splashTimeOut)
    }
}