class Solution {
    fun solution(a: Int, b: Int, flag: Boolean): Int {
        var answer: Int = 0
        
        if(flag == true) {
            answer = a + b
        } else {
            answer = a - b
        }
        
        return answer
    }
}