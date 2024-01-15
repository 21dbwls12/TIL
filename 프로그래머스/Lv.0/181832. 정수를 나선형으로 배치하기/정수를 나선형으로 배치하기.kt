class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer: Array<IntArray> = Array(n) { (IntArray(n) { 0 }) }
        var change = 0
        var i = 0
        var j = 0

        for (num in 1 .. n * n) {
            if(answer[i][j] == 0) {
                answer[i][j] = num
            }

            when (change % 4) {
                0 -> {
                    if(j == n - 1 || answer[i][j + 1] != 0) {
                        i++
                        change++
                    } else {
                        j++
                    }
                }
                1 -> {
                    if(i == n - 1 || answer[i + 1][j] != 0) {
                        j--
                        change++
                    } else {
                        i++
                    }
                }
                2 -> {
                    if(j - 1 < 0 || answer[i][j - 1] != 0) {
                        i--
                        change++
                    } else {
                        j--
                    }
                }
                else -> {
                    if (i - 1 < 0 || answer[i - 1][j] != 0) {
                        j++
                        change++
                    } else {
                        i--
                    }
                }
            }
        }
        return answer
    }
}