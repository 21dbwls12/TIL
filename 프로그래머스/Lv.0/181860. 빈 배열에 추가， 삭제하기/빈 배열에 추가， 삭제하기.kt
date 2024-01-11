class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer: IntArray = intArrayOf()

        for (i in flag.indices) {
            if (flag[i]) {
                for (j in 0 .. arr[i] * 2 - 1) {
                    answer = answer.plus(arr[i])
                }
            } else {
                answer = answer.take(answer.size - arr[i]).toIntArray()
            }
        }
        return answer
    }
}