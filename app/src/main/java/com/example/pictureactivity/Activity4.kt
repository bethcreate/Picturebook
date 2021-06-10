package com.example.pictureactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity4 : AppCompatActivity() {
    lateinit var tvcaption4: TextView
    lateinit var btnprevious4: Button
    lateinit var btnNext4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        castView4()
        onClick()
    }
fun castView4(){
    tvcaption4=findViewById(R.id.tvcaption4)
    btnprevious4=findViewById(R.id.btnprevious4)
    btnNext4=findViewById(R.id.btnNext4)

}
fun onClick(){
    btnNext4.setOnClickListener {
        var intent = Intent(baseContext, Activity5::class.java)
        startActivity(intent)
    }


    btnprevious4.setOnClickListener {
        var intent= Intent(baseContext,Activity3:: class.java)
        startActivity(intent)

}

}
        }

