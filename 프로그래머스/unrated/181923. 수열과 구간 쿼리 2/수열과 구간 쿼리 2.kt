import kotlin.math.min

class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()

        for(query in queries) {
            val (s, e, k) = query
            val i = s .. e
            val part = arr.slice(i).filter { it > k }

            answer = answer.plus(part.minOrNull()?: -1)
        }

        return answer
    }
}