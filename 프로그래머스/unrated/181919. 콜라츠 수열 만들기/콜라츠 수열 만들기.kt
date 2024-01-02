class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf(n)
        var x = n
        
        while(x != 1) {
            if(x % 2 == 0) {
                x = x / 2
            } else {
                x = 3 * x + 1
            }
            answer = answer.plus(x)
        }
        
        return answer
    }
}