package org.example.lesson_2

fun main() {
    val worker: Short = 50
    val intern: Short = 30

    val workerSalary: Short = 30000
    val internSalary: Short = 20000

    val allWorkerSalary: Int = worker * workerSalary
    println(allWorkerSalary)

    val allSalary: Int = (intern * internSalary) + allWorkerSalary
    println(allSalary)

    val avgSalary: Int = (allSalary / (worker + intern))
    println(avgSalary)
}