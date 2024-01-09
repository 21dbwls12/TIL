class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        
        for (s in myString) {
            if (s == 'a' || s == 'A') {
                answer += s.uppercase()
            } else {
                answer += s.lowercase()
            }
        }
        return answer
    }
}