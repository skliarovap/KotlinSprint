package com.kotlinsprint.lesson_1

fun main() {
    val inputSeconds: Short = 6480

    val hours = "0${inputSeconds / 60 / 60}"
    val minutes = inputSeconds / 60 % 60
    val seconds = "0${inputSeconds - (hours.toInt() * 60 * 60 + minutes * 60)}"

    println("$hours:$minutes:$seconds")
}