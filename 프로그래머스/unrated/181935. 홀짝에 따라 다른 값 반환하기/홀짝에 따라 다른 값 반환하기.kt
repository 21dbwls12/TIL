class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        if(n % 2 != 0) {
            for (e in 1 .. n step 2) {
                answer += e
            } 
        } else {
            for (e in 2 .. n step 2) {
                answer += e * e
            }
        }
        
        return answer
    }
}