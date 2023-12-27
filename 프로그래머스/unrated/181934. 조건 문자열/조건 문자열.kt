class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer: Int = 0
        var condition: Boolean = false

        when {
            ineq == ">" && eq == "=" -> condition = n >= m
            ineq == "<" && eq == "=" -> condition = n <= m
            ineq == ">" && eq == "!" -> condition = n > m
            ineq == "<" && eq == "!"-> condition = n < m
        }
        
        answer = if(condition) {
            1
        } else {
            0
        }

        return answer
    }
}