class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""

        answer = my_string.substring(0.. s - 1) + overwrite_string + my_string.substring(s + overwrite_string.length)

        return answer
    }
}