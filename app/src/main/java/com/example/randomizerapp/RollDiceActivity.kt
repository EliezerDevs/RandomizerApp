package com.example.randomizerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class RollDiceActivity : AppCompatActivity() {
    private lateinit var randomNumber: RandomNumber
    private lateinit var imageDice: ImageView
    private lateinit var buttonDice: Button
    private lateinit var back: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roll_dice)

        randomNumber = RandomNumber()
        imageDice = findViewById(R.id.imageDice)
        buttonDice = findViewById(R.id.buttonDice)
        back = findViewById(R.id.back1)

        var number = randomNumber.valorRandom(1..6)
        generateDice(number)

        buttonDice.setOnClickListener{
            number = randomNumber.valorRandom(1..6)
            generateDice(number)
        }

        back.setOnClickListener {
            finish()
        }

    }

    private fun generateDice(number: Int){
        when(number){
            1 -> imageDice.setImageResource(R.drawable.alea_1)
            2 -> imageDice.setImageResource(R.drawable.alea_2)
            3 -> imageDice.setImageResource(R.drawable.alea_3)
            4 -> imageDice.setImageResource(R.drawable.alea_4)
            5 -> imageDice.setImageResource(R.drawable.alea_5)
            6 -> imageDice.setImageResource(R.drawable.alea_6)
        }
    }


}