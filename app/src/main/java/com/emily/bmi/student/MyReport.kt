package com.emily.bmi.student

abstract class MyReport {

    abstract fun load() //抽象類別裡也可以定義要被繼承的指定規範

    fun print() {
        println("抽象類別裡也可以寫自己的方法")
    }
}