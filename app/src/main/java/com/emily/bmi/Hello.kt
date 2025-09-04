package com.emily.bmi

class Hello {
}

fun main() {

    val p01 = Person01("Jack",65.5,1.7)
    p01.hello()
    println("BMI of Jack:" + p01.bmi())

    val p = Person()
    p.hello()
    p.weight = 65.5f
    p.height = 1.7f
    println(p.bmi())


    println("Hello World!")
    val w = 65.5
    val h = 1.7
    val bmi = w / (h * h)
    println("BMI:" + bmi)
    /*

    //Byte, Short, Int, Long
    val age = 20
    val population:Long = 9999
    //val population = 9999L
    println(age.inc())
    val name = "Hank"
    println(name.get(1))
    var name_2 = "Hank"
    name_2 = "Jack"
    println(name_2)
    //Float(32), Double(64)
    val weight = 65.5f
    //true, false
    val isAdult = true
    //Char
    val c = 'A'
    println(c)
    println(weight)
    */
}