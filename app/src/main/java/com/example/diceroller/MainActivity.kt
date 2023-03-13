package com.example.diceroller

//import android.widget.Toast

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button2)
        rollButton.setOnClickListener{
         // val toast = Toast.makeText(this, "dice rolled", Toast.LENGTH_LONG)
          //  toast.show()
            val textview:TextView = findViewById(R.id.textview)
            textview.text = "5"


        }

    }
}