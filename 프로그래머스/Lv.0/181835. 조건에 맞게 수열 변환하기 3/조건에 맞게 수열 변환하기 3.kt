class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer: IntArray = arr
        
        if (k % 2 == 0) {
            answer = answer.map { it + k }.toIntArray()
        } else {
            answer = answer.map { it * k }.toIntArray()
        }
        return answer
    }
}