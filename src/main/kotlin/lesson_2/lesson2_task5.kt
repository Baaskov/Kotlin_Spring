package org.example.lesson_2

import kotlin.math.pow

fun main() {
    var percent: Double = 0.167
    var summ: Int = 70000
    var years: Int = 20

    println(String.format("%.3f", (summ*(1+percent*365/365*1).pow(20))))

}