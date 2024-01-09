class Solution {
    fun solution(my_string: String, alp: String): String {
        var answer: String = ""
        
        for (s in my_string) {
            if (s.toString() == alp) {
                answer += s.uppercase()
            } else {
                answer += s
            }
        }
        return answer
    }
}