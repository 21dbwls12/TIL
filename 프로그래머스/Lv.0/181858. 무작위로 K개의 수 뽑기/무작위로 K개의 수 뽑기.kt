class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (n in arr) {
            if (answer.size >= k) {
                break
            } else {
                if (!answer.contains(n)) {
                    answer = answer.plus(n)
                }
            }
        }
        while (answer.size < k) {
            answer = answer.plus(-1)
        }
        return answer
    }
}