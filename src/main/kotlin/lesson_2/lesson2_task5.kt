package org.example.lesson_2

import kotlin.math.pow

fun main() {
    var percent: Double = 16.7
    percent /= 100
    val sum: Int = 70000
    val years: Int = 20
    val dayAYear: Int = 365
    val daysBeforeAccrual: Int = 365

    println(String.format("%.3f", (sum * (1 + percent * daysBeforeAccrual / dayAYear * 1).pow(20))))
}