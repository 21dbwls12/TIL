class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        var answer: Array<IntArray> = arr.clone()

        for (i in answer.indices) {
            while (answer.size > answer[i].size) {
                answer[i] = answer[i].plus(0)
            }
            while (answer.size < answer[i].size) {
                answer = answer.plus(IntArray(answer[i].size) { 0 })
            }
        }
        return answer
    }
}