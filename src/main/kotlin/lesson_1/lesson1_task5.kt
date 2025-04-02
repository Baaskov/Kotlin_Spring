package org.example.lesson_1

fun main() {
    val allTime: Short = 6480
    val minuteInSecond: Byte = 60
    val hoursInSecond: Short = 3600

    val hours: Int = allTime / hoursInSecond
    val minute: Int = allTime / minuteInSecond - (hours * minuteInSecond)
    val seconds: Int = allTime - (hours * hoursInSecond) - (minute * minuteInSecond)

    println(String.format("%02d:%02d:%02d", hours, minute, seconds))
}