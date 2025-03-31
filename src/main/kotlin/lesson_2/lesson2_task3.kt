package org.example.lesson_2

fun main() {
    var hours: Int = 9
    var minutes: Int = 39
    var outTime: Int = (hours * 60) + minutes
    var travelTime: Int = 457

    var arrivalTime: Int = outTime + travelTime
    hours = (arrivalTime / 60)
    minutes = (arrivalTime % 60)

    print(hours)
    print(":")
    print(minutes)
}