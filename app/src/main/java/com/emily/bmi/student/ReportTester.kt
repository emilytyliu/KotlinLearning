package com.emily.bmi.student

fun main() {
    val reports = listOf<Report>(
        FinanceReport(),
        HealthReport()
    )
    for (report in reports){
        report.load()
        report.print("Test")
    }

    println()
    val myreports = listOf<MyReport>(
        SalaryReport()
    )
    for (myreport in myreports){
        myreport.load()
        myreport.print()
    }
}