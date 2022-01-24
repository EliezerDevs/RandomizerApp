package com.example.randomizerapp

import android.content.Intent
import android.graphics.drawable.Drawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class CoinFlippingActivity : AppCompatActivity() {
    private lateinit var randomNumber: RandomNumber
    private lateinit var imageCoin : ImageView
    private lateinit var buttonCoin: Button
    private lateinit var back: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_flipping)

        randomNumber = RandomNumber()
        imageCoin = findViewById(R.id.imageCoin)
        buttonCoin = findViewById(R.id.buttonCoin)
        back = findViewById(R.id.back)

        var number = randomNumber.valorRandom(0..1)
        generateCoin(number)

        buttonCoin.setOnClickListener {
            number = randomNumber.valorRandom(0..1)
            generateCoin(number)
        }

        back.setOnClickListener {
            finish()
        }
    }

    private fun generateCoin(number: Int){
        when(number){
            0 -> imageCoin.setImageResource(R.drawable.cross)
            1 -> imageCoin.setImageResource(R.drawable.face)
        }
    }
}