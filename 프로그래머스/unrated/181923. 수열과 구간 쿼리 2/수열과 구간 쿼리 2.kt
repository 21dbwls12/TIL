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

"""
역시 내장함수(filter, slice)를 사용하니깐 처리시간이 늘어남
22~50ms사이를 왔다갔다함
줄이려면 반복문 직접 구현하면 됨
"""
