package com.emily.bmi

fun main() {

    println("List C2U14")
    //list application
    var nums = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    nums.shuffle() //打亂list
    println(nums)
    val secret = nums.removeAt(0)
    println("secret is $secret")
    println(nums)
    val bomb = nums.removeAt(0)
    println("bomb is $bomb")
    println(nums)

    //list
    val list = listOf<Int>(2,5,8)  //不可變list
    println("list is $list")
    println("list[2] is ${list[2]}")
    println(list[2])

    val list01 = mutableListOf<Int>(2,5,8)  //可變list
    list01.add(13)
    list01.removeAt(1)
    println("list01 is $list01")
    println("list01[2] is ${list01[2]}")
    println(list01[2])

    //Array
    val array = intArrayOf(2,5,8)
    println("array is $array")
    println("array[2] is $array[2]")
    println(array[2])

    println("Chapter 2 Unit 8 Null Check")
    val name:String = "Hank"
    println(name.length)
    val name01:String? = null
    println(name01?.length)
    val name02:String? ="Emily"
    println(name02?.length)
    //Elvis ?:
    //如果左邊是Null就給右邊的值
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