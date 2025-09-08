package com.emily.bmi

fun main() {
    println("Poker C2U16")
    for (i in 0 until 52){
        //Statement
        //Expression
        // type C, D, H, S
        var type = if(i/13 == 0){
                "C"
            }else if(i/13 == 1){
                "D"
            }else if(i/13 == 2) {
                "H"
            }else {
                "S"
            }
        if(i%13==0 && i !=0) println()
        print("${(i)%13+1}$type ")
    }
}