class Solution {
    fun solution(q: Int, r: Int, code: String): String {
        var answer: String = ""
        
        for (i in code.indices) {
            if (i % q == r) {
                answer += code[i]
            }
        }
        
        return answer
    }
}