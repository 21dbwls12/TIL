class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0

        if (num_list.size >= 11) {
            answer = num_list.sum()
        } else {
            answer = num_list.reduce { acc, i -> acc * i }
        }
        return answer
    }
}