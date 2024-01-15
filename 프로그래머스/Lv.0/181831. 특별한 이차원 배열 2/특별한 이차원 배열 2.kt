class Solution {
    fun solution(arr: Array<IntArray>): Int {
        var answer: Int = 1
        
        for ((i, array) in arr.withIndex()) {
            for (j in array.indices) {
                if (arr[i][j] != arr[j][i]) {
                    answer = 0
                    break
                }
            }
        }
        return answer
    }
}