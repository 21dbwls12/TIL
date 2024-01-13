class Solution {
    fun solution(n_str: String): String {
        var answer: String = n_str

        for (i in answer.indices) {
            if (answer[i] != '0') {
                answer = answer.removeRange(0, i)
                break
            }
        }
        return answer
    }
}