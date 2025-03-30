package org.example.lesson_1

fun main() {
    var allTime: Short = 6480

    var hours: Int = allTime / 3600
    if (hours < 10)
        print("0" + hours)
    else
        print(hours)

    var minute: Int = allTime / 60 - (hours * 60)
    if (minute < 10)
        print(":0" + minute)
    else
        print(":" + minute)

    var seconds: Int = allTime - (hours * 3600) - (minute * 60)
    if (seconds < 10)
        print(":0" + seconds)
    else
        print(":" + seconds)

}