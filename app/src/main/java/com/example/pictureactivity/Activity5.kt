package com.example.pictureactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity5 : AppCompatActivity() {
    lateinit var tvcaption5: TextView
    lateinit var btnprevious5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5)

fun castView5(){
    var tvcaption5=findViewById<TextView>(R.id.tvcaption5)
    var btnprevious5=findViewById<Button>(R.id.btnprevious5
    )

}
fun onClick(){
    btnprevious5.setOnClickListener {
        var intent= Intent(baseContext, Activity4::class.java)
        startActivity(intent)
    }

}

    }
}