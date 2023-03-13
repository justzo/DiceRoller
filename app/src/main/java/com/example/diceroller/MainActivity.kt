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
            // creates pop up with "dice roll" text


            //val textview:TextView = findViewById(R.id.textview)
           // textview.text = "5"
            // set text view field to 5 when button is pressed


            RollDie() // calls specific function
        }





    }

    private fun RollDie() {
        // 6 sided die created and displayed to user
        val localDice = Dice(6)
        val cubeRoll = localDice.roll()
        val textview:TextView = findViewById(R.id.textview)
        textview.text = cubeRoll.toString()

    }
    class Dice (val NumberOfSide: Int){
        //random number generator above 1
        fun roll():Int{
            return (1..NumberOfSide).random()
        }

    }
}