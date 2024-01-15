class Solution {
    fun solution(board: Array<IntArray>, k: Int): Int {
        var answer: Int = 0

        // for ((i, array) in board.withIndex()) {
        for (i in board.indices) {
            for (j in board[i].indices) {
                if (i + j <= k) {
                    answer += board[i][j]
                }
            }
        }
        return answer
    }
}