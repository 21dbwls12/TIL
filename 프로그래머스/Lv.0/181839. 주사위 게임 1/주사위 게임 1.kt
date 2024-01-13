import kotlin.math.abs

class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0

        answer = when {
            !checkEven(a) && !checkEven(b) -> (a * a) + (b * b)
            !checkEven(a) || !checkEven(b) -> 2 * (a + b)
            else -> abs(a - b)
        }
        return answer
    }
    
    private fun checkEven(n: Int): Boolean {
        var result = false
        
        if(n % 2 == 0) {
            result = true
        }
        return result
    }
}