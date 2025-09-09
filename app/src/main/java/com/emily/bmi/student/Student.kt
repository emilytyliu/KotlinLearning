package com.emily.bmi.student
//學生有學號、姓名、英文成績、數學成績
//印出學生資料
//印出學生平均成績
//印出學生等級(A,B,C,D,F)

open class Student(val id: String, val name: String, var english: Int = 0, var math: Int = 0) {
    //constructor(id: String, name: String) : this(id, name, 0, 0)
    open fun print() {
        val mark = if(average() < pass) "*" else " "
        println("$id\t$name\t$english\t$math\t${average()}$mark\t${average01()}\t${grading()}\t${grading01()}\t${grading02()}")
    }

    protected fun average(): Int {
        return (english + math) / 2
    }

    fun average01() = (english + math) / 2
    fun grading(): String {
        val grade = when (average() / 10) {
            9, 10 -> "A"
            8 -> "B"
            7 -> "C"
            6 -> "D"
            else -> "F"
        }
        return grade
    }

    fun grading01(): String {
        return when (average() / 10) {
            9, 10 -> "A"
            8 -> "B"
            7 -> "C"
            6 -> "D"
            else -> "F"
        }
    }

    fun grading02() = when (average() / 10) {
        9, 10 -> "A"
        8 -> "B"
        7 -> "C"
        6 -> "D"
        else -> "F"
    }

    //Companion Object C3U7
    companion object {
        var pass = 60
        val curry = Student("004", "Curry", 10,10)
        val john = Student("005", "John", 20, 20)
        fun create(id: String, name: String = "K", english: Int = 0 , math: Int = 0 ): Student {
            if (id == "004") return curry
            else if (id =="005") return john
            return Student(id, name, english, math )
        }

    }
}

fun main() {


    val stu1 = Student("001", "Jack", 30, 75)
    val stu2 = Student("002", "Hank", 66, 87)
    val stu3 = Student("003", "Jane")
    val stu4 = Student.create("004", "K", 82,65)
    val stu5 = Student.create("005")
    stu1.print()
    stu2.print()
    stu3.print()
    stu4.print()
    stu5.print()
    println()

    Student.pass = 50
    val students = listOf<Student>(
        Student("001", "Jack", 30, 75),
        Student("002", "Hank", 66, 87),
        Student("003", "Jane")
    )
    for (i in 0..2) {
        students.get(i).print()
    }
    println()
    for (i in students) {
        i.print()
    }
}