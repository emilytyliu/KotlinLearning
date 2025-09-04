package com.emily.bmi


class Person {

    var weight:Float = 0f
    var height:Float = 0f
    fun bmi(): Float {
        val bmi = weight / (height*height)
        return bmi
    }

    fun hello() {
        println("Hello Person Class")
    }

}

