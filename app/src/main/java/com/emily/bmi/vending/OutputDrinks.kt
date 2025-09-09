package com.emily.bmi.vending

import java.io.File

fun main() {
    val drinks = listOf<Drink>(
        Drink("Black Tea", 0,50),
        Drink("Green Tea", 5,45),
        Drink("Wuloong Tea", 0,60)
    )

    val out = File("order.txt").printWriter()
    for (i in drinks) {
        out.println("${i.name},${i.suger},${i.price}")
    }
    out.flush()

    val out01 = File("order01.txt").bufferedWriter()
    for (i in drinks) {
        out01.write("${i.name},${i.suger},${i.price}\n")
    }
    out01.flush()
}