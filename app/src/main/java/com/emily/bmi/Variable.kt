package com.emily.bmi

fun main() {
    println("Chapter 2 Unit 8 Null Check")
    var name:String = "Hank"
    println(name.length)
    var name01:String? = null
    println(name01?.length)
    var name02:String? ="Emily"
    println(name02?.length)
    //Elvis ?:
    println(name ?: 7)
    println(name01 ?: 8)
    println(name02 ?: 9)
    /* println("Chapter 2 Unit 7")
    var countor = 0
    countor = countor +1
    println(countor)
    countor++
    println(countor)
    countor--
    println(countor)
    println(countor.toDouble())
    println("10 % 3 = " + 10 % 3)
    println("10 / 3 = " + 10 / 3)
    println("10.0 / 3 = " + 10.0 / 3)
    println("10 / 3.0 = " + 10 / 3.0)
    //boolean
    var a = true
    var b = false
    println(!a)
    println(a && b)
    println(a || b)
    //Compare
    println("Compare")
    val num = 1
    println(num >= -3 && num <=5)
    println(num < -3 || num > 5)
    */
}