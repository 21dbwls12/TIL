class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer: Array<IntArray> = arrayOf<IntArray>()

        for (i in 0 .. n - 1) {
            val temp = IntArray(n) { 0 }

            temp[i] = 1
            answer +=temp
        }
        return answer
    }
}