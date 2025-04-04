package org.example.lesson_2

fun main() {
    val hours: Int = 9
    val minutes: Int = 39
    val minutesInHours: Int = 60
    val outTime: Int = (hours * minutesInHours) + minutes
    val travelTime: Int = 457

    val arrivalTime: Int = outTime + travelTime

    print(arrivalTime / minutesInHours)
    print(":")
    print(arrivalTime % minutesInHours)
}