class Solution {
    fun solution(my_string: String, s: Int, e: Int): String {
        var answer: String = my_string
        val temp = my_string.substring(s, e + 1).reversed()

        answer = answer.replaceRange(s, e + 1, temp)
        return answer
    }
}