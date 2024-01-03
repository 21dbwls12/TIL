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

"""
세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
이 부분에서 테스트가 계속 실패함. 6, 29, 38
어느 부분에서 오류가 나는지 반례를 찾는 것에 시간이 오래 걸림.
정렬이 안돼서 1, 2, 2, 2를 넣었을 때 441이 나와야하는 데 144가 나옴.
"""
