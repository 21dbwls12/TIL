class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        var answer: String = ""
        var list = my_string.chunked(m)
        
        for (word in list) {
            answer += word[c - 1]
        }
        return answer
    }
}