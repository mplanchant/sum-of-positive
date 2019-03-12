package uk.co.logiccache

fun sumOfPositives(input: List<Int>): Int {
    return input
        .filter { i -> i > 0 }
        .sum()
}