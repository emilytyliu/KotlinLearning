package com.emily.bmi.vending

fun main() {

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

    val drink1 = Drink("tea", 0, 50)
    println(drink1)
    val drink2 = drink1.copy(suger = 5)
    println(drink2)

    println()
    println("C4U4 Extension")
    val s="abcdef"
    println(s.validate())

    println()
    val discountDrink2 = drink2.off20()
    println(drink2)
    println(discountDrink2)

}

fun String.validate(): Boolean {
    return this.length >=6
}

fun Drink.off20():Drink {
    return this.copy(price = (this.price *0.8).toInt())
}