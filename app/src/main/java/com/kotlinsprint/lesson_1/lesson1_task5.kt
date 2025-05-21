package com.kotlinsprint.lesson_1

fun main() {
    val seconds: Short = 6480
    val minutes = seconds / 60

    val hours = "0${minutes / 60}"

    val resultMinutes = minutes - (60 * hours.toInt())
    val resultSeconds = "0${seconds - (hours.toInt() * 60 * 60 + resultMinutes * 60)}"

    println("$hours:$resultMinutes:$resultSeconds")
}