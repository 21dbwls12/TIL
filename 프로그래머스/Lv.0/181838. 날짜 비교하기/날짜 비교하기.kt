class Solution {
    fun solution(date1: IntArray, date2: IntArray): Int {
        var answer: Int = 0

        for (i in date1.indices) {
            when (checkNext(date1[i], date2[i])) {
                1 -> {
                    answer = 1
                    break
                }
                -1 -> continue
                else -> break
            }
        }
        return answer
    }

    private fun checkNext(a: Int, b:Int): Int {
        return when {
            a < b -> 1
            a == b -> -1
            else -> 0
        }
    }
}