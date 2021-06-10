package com.example.pictureactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    lateinit var btnprevious: Button
    lateinit var btnNext2: Button
    lateinit var tvcaption2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        castView2()
        onClick()


    }

    fun castView2() {
        btnprevious = findViewById(R.id.btnprevious)
        btnNext2 = findViewById(R.id.btnNext2)
        tvcaption2 = findViewById(R.id.tvcaption2)
    }

    fun onClick() {
        btnNext2.setOnClickListener {
            var intent = Intent(baseContext, Activity3::class.java)
            startActivity(intent)

            btnprevious.setOnClickListener {
                var intent = Intent(baseContext, MainActivity::class.java)
                startActivity(intent)


            }

        }


    }
}





