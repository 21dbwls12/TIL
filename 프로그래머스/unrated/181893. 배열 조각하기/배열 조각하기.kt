class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer: IntArray = arr

        for (i in query.indices) {
            answer = if (i % 2 == 0) {
                answer.take(query[i] + 1).toIntArray()
            } else {
                answer.drop(query[i]).toIntArray()
            }
        }
        return answer
    }
}