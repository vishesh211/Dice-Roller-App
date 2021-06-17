package com.example.diceroller

import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton: Button = findViewById(R.id.button)
        rollbutton.setOnClickListener{
            rollDice()
        }
        rollDice()
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()

        val diceimage:ImageView= findViewById(R.id.imageView2)
        when(diceRoll)
        {
            1 -> diceimage.setImageResource(R.drawable.dice_1)
            2 -> diceimage.setImageResource(R.drawable.dice_2)
            3->diceimage.setImageResource(R.drawable.dice_3)
            4->diceimage.setImageResource(R.drawable.dice_4)
            5->diceimage.setImageResource(R.drawable.dice_5)
            6->diceimage.setImageResource(R.drawable.dice_6)
        }
        diceimage.contentDescription=diceRoll.toString()

    }
}

class Dice(private val numsides: Int) {
    fun roll(): Int {
        return (1..numsides).random()
    }
}
