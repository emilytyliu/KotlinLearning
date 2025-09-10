package com.emily.bmi.vending

import java.net.URL

fun main() {
    println("網路連線並取得資料 C4U7")
    //https://api.jsonserve.com/AXh1oX //老師用的，怪怪的
    //https://json.org/example.html //老師有提到
    //val text = URL("https://json.org/example.html").readText()
    //println(text)
    val input = URL("https://json.org/example.html").openStream()
    val reader = input.bufferedReader()
    var line = reader.readLine()
    println(line)
    //while(line != null){
    //  println(line)
    //  line= reader.readLine()
    //}
}