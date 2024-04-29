package com.company.kodingtest


fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val count = readLine().split(" ").map { it.toInt() }.count {
        var isPrime = true

        if (it == 1) {
            isPrime = false
        } else {
            for (i in 2 until it) {
                if (it % i == 0) isPrime = false
            }
        }

        isPrime
    }
    println(count)
}