import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        var answer: Int = 0
        var counts = listOf(a, b, c, d).groupingBy { it }.eachCount()

        answer = when (counts.size) {
            1 -> 1111 * a
            2 -> {
                if (counts.values.maxOf {it} == 3) {
                    counts = counts.toList().sortedByDescending { it.second }.toMap()
                    val (p, q) = counts.keys.toList()
                    (10 * p + q) * (10 * p + q)
                } else {
                    val (p, q) = counts.keys.toList()
                    (p + q) * abs(p - q)
                }
            }
            3 -> counts.filter { it.value == 1 }.keys.reduce {q, r -> q * r}
            else -> counts.keys.minOf {it}
        }

        return answer
    }
}