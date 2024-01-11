import kotlin.math.*

class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = arr
        var p = 0.toDouble()
        val s = 2.toDouble()

        while (true) {
            if (answer.size > s.pow(p)) {
                p++
            } else if (answer.size < s.pow(p)) {
                answer = answer.plus(0)
            } else {
                break
            }
        }
        return answer
    }
}