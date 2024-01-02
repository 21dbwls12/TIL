class Solution {
    fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean {
        var answer: Boolean = true

        answer = down(up(x1, x2), up(x3, x4))

            return answer
    }
    fun up(x: Boolean, y: Boolean): Boolean {
        return x || y
    }
    fun down(x: Boolean, y: Boolean): Boolean {
        return x && y
    }
}
