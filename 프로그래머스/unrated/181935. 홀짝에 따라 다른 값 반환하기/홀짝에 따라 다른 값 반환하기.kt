class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        if(n % 2 != 0) {
            for (e in 1 .. n) {
                if(e % 2 != 0) {
                    answer += e
                } else {
                    continue
                }
            } 
        } else {
            for (e in 1 .. n) {
                if(e % 2 == 0) {
                    answer += e * e
                } else {
                    continue
                }
            }
        }
        
        return answer
    }
}