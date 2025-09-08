package com.emily.bmi

import kotlin.random.Random

fun main() {

    //val secret = Random.nextInt(1,11)
    val secret = (1..10).random()
    println("Secret number is $secret")
    var low_number = 1
    var up_number = 10
    var guess = 0
    while (guess != secret) {
        print("Please enter a number between $low_number to $up_number:")
        var input = readLine()
        guess = input?.toIntOrNull() ?: 0
        println("The number you entered is $guess")

        if (guess > secret && guess <= up_number) {
            up_number = guess-1
        } else if(guess < secret && guess >= low_number) {
            low_number = guess+1
        } else if(guess == secret){
            break
        }
    }
    println("Great! You got it!")
}