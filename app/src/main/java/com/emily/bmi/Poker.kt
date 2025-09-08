package com.emily.bmi

fun main() {
    println("Poker C2U16")
    for (i in 0 until 52) {  //0..<52
        //Statement
        //Expression
        // type C, D, H, S
        val a = i / 13
        /*var type = if(a == 0){
                "C"
            }else if(a == 1){
                "D"
            }else if(a == 2) {
                "H"
            }else "S"*/
        val type = when (a) {
            0 -> "C"
            1 -> "D"
            2 -> "H"
            else -> "S"
        }
        if (i % 13 == 0 && i != 0) println()
        print("${(i) % 13 + 1}$type ")
    }
    println()
    println()
    for (i in 0..<52){
        //Statement
        //Expression
        // type ♣ ♦ ♥ ♠
        val b = i/13
        val type01 = when {
            b == 0 -> "♣"
            b == 1 -> "♦"
            b == 2 -> "♥"
            else -> "♠"  //{}
        }
        if(i%13==0 && i !=0) println()
        print("${(i)%13+1}$type01 ")
    }
    println()
    println()
    println("list and set C3U2")
    val deck = mutableListOf<Int>()  //list有順序、資料可重複
    for (i in 0..<52){
        deck.add(i)
    }
    println(deck)
    val deck01=deck.shuffled()
    println(deck01)

    println()
    val set = setOf<Int>(5,3,1,9,4,9,3)  //不重複、沒有順序
    println("set of (5,3,1,9,4,9,3) is $set")
    set.forEach { println(it) }  //要用it
    println()
    set.forEach { n ->  println(n) }  //自己取名要加 ->

}