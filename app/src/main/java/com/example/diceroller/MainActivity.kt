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


            rollDie() // calls specific function
            rollDie2()
        }





    }

    private fun rollDie2() {
        val localDice = Dice(6)
        val cubeRoll = localDice.roll()
        val textview2:TextView = findViewById(R.id.textview2)
        textview2.text = cubeRoll.toString()
    }

    private fun rollDie() {
        // 6 sided die created and displayed to user
        val localDice = Dice(6)
        val cubeRoll = localDice.roll()
        val textview:TextView = findViewById(R.id.textview)
        textview.text = cubeRoll.toString()

    }
    class Dice (private val NumberOfSide: Int){
        //random number generator above 1
        fun roll():Int{
            return (1..NumberOfSide).random()
        }

    }
}