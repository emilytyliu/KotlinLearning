package com.emily.bmi.vending

import androidx.compose.ui.window.Dialog
import java.io.File

fun main() {
    val drinks = mutableListOf<Drink>()
    val input = File("order.txt").bufferedReader()
    var line = input.readLine()
    while (line != null) {
        println(line)
        val taken = line.split(",")
        try {
            val drink = Drink(taken[0],taken[1].toInt(),taken[2].toInt())
            drinks.add(drink)
        } catch (ex: IndexOutOfBoundsException){
            println("Invalid data format!")
        }
        line = input.readLine()
    }
    println(drinks)
}