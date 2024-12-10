package com.jetbrains.a2numbers

fun main() {
    // 1) (a + b - c) * 2 / 3 % 5 where a = 10, b = 20, c = 5
    val a1: Int = 10
    val b1: Int = 20
    val c1: Int = 5
    val res1 = (a1 + b1 - c1) * 2 / 3 % 5
    println("The result to #1 is: $res1")

    // 3) (a + b > c) && ((a - b) < c) where a = 10, b = 5, c = 20
    val a3: Int = 10
    val b3: Int = 5
    val c3: Int = 20
    val res3 = (a3 + b3 > c3) && ((a3 - b3) < c3)
    println("The result to #3 is: $res3")

    // 6) ((a * b) * c) / d + d % 4 - (c and d) where a = 11, b = 20, c = 7, d = 13
    val a6: Int = 11
    val b6: Int = 20
    val c6: Int = 7
    val d6: Int = 13
    val res6 = ((a6 * b6) * c6) / d6 + d6 % 4 - (c6 and d6)
    println("The result to #6 is: $res6")

    // 9) ((a - b) * c) * d * 2 + a % d - (c * d) where a = 5, b = 3, c = 2, d = 4
    val a9: Int = 5
    val b9: Int = 3
    val c9: Int = 2
    val d9: Int = 4
    val res9 = ((a9 - b9) * c9) * d9 * 2 + a9 % d9 - (c9 * d9)
    println("The result to #9 is: $res9")

    // 13) (7 * a + 3 * b - 6 * c) / ((a - b) * c) where a = 18, b = 15, c = 120
    val a13: Int = 18
    val b13: Int = 15
    val c13: Int = 120
    val res13 = (7 * a13 + 3 * b13 - 6 * c13) / ((a13 - b13) * c13)
    println("The result to #13 is: $res13")

    // 16) ((a * c) / b) / d + 10 * a % b - (a / d) where a = 9, b = 2, c = 70, d = 7
    val a16: Int = 9
    val b16: Int = 2
    val c16: Int = 70
    val d16: Int = 7
    val res16 = ((a16 * c16) / b16) / d16 + 10 * a16 % b16 - (a16 / d16)
    println("The result to #16 is: $res16")

    // 19) ((a + c) / d) * a - 3 + 7 * (a - d) - (c * d) where a = 3, b = 19, c = 20, d = 9
    val a19: Int = 3
    val b19: Int = 19
    val c19: Int = 20
    val d19: Int = 9
    val res19 = ((a19 + c19) / d19) * a19 - 3 + 7 * (a19 - d19) - (c19 * d19)
    println("The result to #19 is: $res19")

    // 20) ((a - b + d) * c) / d * 2 + 18 * (a + d) + (c % d) where a = 15, b = 13, c = 5, d = 40
    val a20: Int = 15
    val b20: Int = 13
    val c20: Int = 5
    val d20: Int = 40
    val res20 = ((a20 - b20 + d20) * c20) / d20 * 2 + 18 * (a20 + d20) + (c20 % d20)
    println("The result to #20 is: $res20")
}

