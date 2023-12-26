class Solution {
    fun solution(number: Int, n: Int, m: Int): Int {
        var answer: Int = 0
        
        if(number % n == 0) {
            if(number % m == 0) {
                answer = 1
            } else {
                answer = 0
            }
        } else {
            answer = 0
        }
        
        return answer
    }
}