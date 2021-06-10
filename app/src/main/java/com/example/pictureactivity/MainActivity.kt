package com.example.pictureactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnNext:Button
    lateinit var tvcaption1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView1()
        onClick()
    }

fun castView1(){
     btnNext=findViewById(R.id.btnNext)
     tvcaption1=findViewById(R.id.tvcaption1)

}

fun onClick(){
    btnNext.setOnClickListener {
        var intent=Intent(baseContext, Activity2:: class.java)
        startActivity(intent)




    }

}



    }
