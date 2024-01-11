import kotlin.math.*

class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = arr
        var p = 0.toDouble()
        val s = 2.toDouble()

        while (true) {
            if (answer.size > s.pow(p)) {
                p++
            } else if (answer.size < s.pow(p)) {
                answer = answer.plus(0)
            } else {
                break
            }
        }
        return answer
    }
}

// pow()안쓰고 초기값을 1로 하고 2를 계속 곱해도 되는 거였음.. 7점 받았으니 뭐..  
