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
}