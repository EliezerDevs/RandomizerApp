package com.example.randomizerapp

import kotlin.random.Random

class RandomNumber {
    fun valorRandom(valores: IntRange) : Int {

        var valorRandom = Random.nextInt(valores.first, valores.last + 1)
        return valorRandom
    }
}