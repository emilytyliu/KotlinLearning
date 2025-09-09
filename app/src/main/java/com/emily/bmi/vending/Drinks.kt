package com.emily.bmi.vending

fun main() {
    val drink1 = Drink("tea", 0, 50)
    println(drink1)
    val drink2 = drink1.copy(suger = 5)
    println(drink2)

    val drinks = mutableMapOf<Int, String>(
        1 to "Coke",
        2 to "7-up",
        3 to "Wuloong",
        4 to "Orange"
    )
    println(drinks)
    println(drinks.get(3))
    drinks.put(5, "Water")
    println(drinks)
}