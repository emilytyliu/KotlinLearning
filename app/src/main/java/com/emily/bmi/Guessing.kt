package com.emily.bmi

import kotlin.random.Random

fun main() {
    println("Hello Guessing C2U9~12")
    println(Random.nextInt(1,11))  //說明Random取亂數
    //println((1..10).random())
    var secret = (1..10).random()  //這個程式使用這個方法
    println("Secret number is $secret")
    var num = 0
    while (num != secret) {
        print("Please enter a number (1~10):")
        val input = readLine()
        num = input?.toIntOrNull() ?: 0
        println("The number you entered is $num.")
        //println("The string length you entered is ${input?.length}.")
        if (num < secret) {
            println("Need bigger")
        } else if (num > secret) {
            println("Need smaller")
        } else {
            println("You got it!")
        }

    }
    println()

    println("for Loop C2U12")
    //val range = 1..20
    for (i in 1..30) {
        print(i)
    }
    println()
    for (i in 1..30) {
        if (i%2==1){
            print("*")
        }else{
            print(" ")
        }
    }
    println()
    for (i in 1..10 step 2) print(i)
    println()
    println()

    println("Array C2U12")
    val array = intArrayOf(3,5,8)
    println(array[2])
    val ss = arrayOf("SUN","MON","TUE","WED")
    println(ss.size)
    println(ss.get(0))
    for (day in ss) {
        print("$day ")
    }
    println()
    println()

    println("Random + for loop C2U13")
    secret = (1..10).random()
    println("Secret number is $secret")
    var bingo = false
    for (i in 1..3) {
        print("Please enter a number (1~10):")
        val input = readLine()
        num = input?.toIntOrNull() ?: 0
        println("The number you entered is $num.")
        //println("The string length you entered is ${input?.length}.")
        if (num < secret) {
            println("Need bigger")
        } else if (num > secret) {
            println("Need smaller")
        } else {
            println("Success! You got it!")
            bingo = true
            break
        }
    }
    if (bingo == false) println("Failed! The secret number is $secret")



}