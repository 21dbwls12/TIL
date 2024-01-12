class Solution {
    fun solution(num_str: String): Int {
        var answer: Int = 0
        
        for (n in num_str) {
            answer += n.toString().toInt()
        }
        return answer
    }
}