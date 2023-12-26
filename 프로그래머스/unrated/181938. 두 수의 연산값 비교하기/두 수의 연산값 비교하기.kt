import kotlin.math.max

class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        var ab = "$a$b".toInt()
        var twoab = 2 * a * b
        
        if (ab == twoab) {
            answer = ab
        } else {
            answer = max(ab, twoab)
        }
        
        return answer
    }
}