class Solution {
    fun solution(num_list: IntArray, n: Int): Int {
        var answer: Int = 0
        
        for (num in num_list) {
            if (num == n) {
                answer = 1
                break
            }
        }
        return answer
    }
}