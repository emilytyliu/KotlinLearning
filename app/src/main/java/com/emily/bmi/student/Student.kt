package com.emily.bmi.student
//學生有學號、姓名、英文成績、數學成績
//印出學生資料
//印出學生平均成績
//印出學生等級(A,B,C,D,F)

class student(val id: String, val name: String, var english:Int, var math:Int) {
    constructor(id: String, name: String) : this(id, name, 0, 0)
    fun print() {
        println("$id\t$name\t$english\t$math")
    }
}

fun main() {
    val stu1 = student("001", "Jack", 70,80)
    val stu2 = student("002", "Hank", 66,87)
    val stu3 = student("003","Jane")
    stu1.print()
    stu2.print()
    stu3.print()

}