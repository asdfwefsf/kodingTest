package com.company.kodingtest

import java.lang.StringBuilder
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val bw = System.out.bufferedWriter()
//    val sb = StringBuilder()
//
//    val (first , last) = readLine().split(" ").map { it.toInt() }
//
//    val array = BooleanArray(last + 1) { false }
//    array[1] = true // 2도 소순데 배열 생성 할 때 초기 배열 설정 할 때 false로 설정되었으니까 수동으로 true로 설정해주기
//
//    for (i in 2..last) {
//        if (!array[i]) {
//            for (j in i * 2..last step i) {
//                array[j] = true
//            }
//        }
//    }
//
//    val primes = (first..last).filter { !array[it] }
//
//    primes.forEach { sb.append(it).append('\n') }
//    bw.write("$sb")
//    bw.flush()
//    bw.close()
//}