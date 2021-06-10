package com.example.pictureactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity3 : AppCompatActivity() {
    lateinit var tvcaption3: TextView
    lateinit var btnprevious3:Button
    lateinit var btnNext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        castView3()
        onClick()
    }

    fun castView3(){
        tvcaption3 = findViewById(R.id.tvcaption3)
        btnprevious3 = findViewById(R.id.btnprevious3)
        btnNext3 = findViewById(R.id.btnNext3)

    }

    fun onClick(){
        btnNext3.setOnClickListener {
            var intent = Intent(baseContext, Activity4::class.java)
            startActivity(intent)
        }


        btnprevious3.setOnClickListener {
            var intent = Intent(baseContext, Activity2::class.java)
            startActivity(intent)

    }

            }

        }

