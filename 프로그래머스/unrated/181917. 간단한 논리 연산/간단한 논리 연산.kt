class Solution {
    fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean {

        val answer: Boolean = down(up(x1, x2), up(x3, x4))

            return answer
    }
    private fun up(x: Boolean, y: Boolean): Boolean {
        return x || y
    }
    private fun down(x: Boolean, y: Boolean): Boolean {
        return x && y
    }
}

// 수정
class Solution {
    fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean {

        val answer: Boolean = down(up(x1, x2), up(x3, x4))

            return answer
    }
    private fun up(x: Boolean, y: Boolean): Boolean {
        return x || y
    }
    private fun down(x: Boolean, y: Boolean): Boolean {
        return x && y
    }
}
