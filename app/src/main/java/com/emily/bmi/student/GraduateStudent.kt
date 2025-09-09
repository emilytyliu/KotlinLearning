package com.emily.bmi.student

class GraduateStudent(id: String, name: String, english: Int, math:Int, val thesis:Int = 0)
    :Student(id, name, english, math) {
    override fun print() {
        val mark = if(average() > pass) " " else "*"
        println("$id\t$name\t$english\t$math\t${average01()}$mark\t${grading02()}\t$thesis")
    }
}

fun main() {
    val gstu = GraduateStudent("008", "Emma", 88,78,85)
    gstu.print()

}