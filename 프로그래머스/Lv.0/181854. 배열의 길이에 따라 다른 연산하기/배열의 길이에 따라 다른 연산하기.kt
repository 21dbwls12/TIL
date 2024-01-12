class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        val answer: IntArray = arr

        if (answer.size % 2 == 0) {
            answer.forEachIndexed { i, _ ->
                if (i % 2 != 0) answer[i] += n
            }
        } else {
            answer.forEachIndexed { i, _ ->
                if (i % 2 == 0) answer[i] += n
            }
        }
        return answer
    }
}