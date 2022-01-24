package com.example.randomizerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var buttonRollDice : Button
    private lateinit var buttonCoinFlipping : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonRollDice = findViewById(R.id.rollDice)
        buttonCoinFlipping = findViewById(R.id.coinFlipping)

        buttonRollDice.setOnClickListener {
            val intent = Intent(this, RollDiceActivity::class.java)
            startActivity(intent)

        }

        buttonCoinFlipping.setOnClickListener {
            val intent = Intent(this, CoinFlippingActivity::class.java)
            startActivity(intent)
        }
    }



}