package com.emily.bmi

class Person01 constructor(val name:String, val weight:Double = 0.0, val height:Double = 0.0) {
    fun bmi():Double {
        val bmi = weight / (height*height)
        return bmi
    }

    fun hello() {
        println("Hello Person01 建構子")
    }
}