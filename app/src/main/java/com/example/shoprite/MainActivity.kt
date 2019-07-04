package com.example.shoprite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            // This prompts the splash screen to end
            //after that start the app main activity

            startActivity(Intent(this,draw::class.java))


            //close the activity
            finish()
        },SPLASH_TIME_OUT)

    }
}
