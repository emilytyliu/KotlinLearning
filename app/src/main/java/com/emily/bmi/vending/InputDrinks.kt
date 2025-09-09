package com.emily.bmi.vending

import androidx.compose.ui.window.Dialog
import java.io.File

fun main() {
    val drinks = mutableListOf<Drink>()
    val input = File("order.txt").bufferedReader()
    var line = input.readLine()
    while (line != null) {
        val taken = line.split(",")
        val drink = Drink(taken[0],taken[1].toInt(),taken[2].toInt())
        println(drink)
        drinks.add(drink)
        line = input.readLine()
    }
    println(drinks)
}