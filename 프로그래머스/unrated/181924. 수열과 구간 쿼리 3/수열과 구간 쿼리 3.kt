class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr.copyOf()

        for(query in queries) {
            val (i, j) = query
            answer[i] = answer[j].also {answer[j] = answer[i]}
        }

        return answer
    }
}