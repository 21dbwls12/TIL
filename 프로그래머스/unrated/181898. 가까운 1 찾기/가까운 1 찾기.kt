class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        var answer: Int = 0
        
        for (i in idx .. arr.size - 1) {
            if(arr[i] == 1) {
                answer = i
                break
            } else {
                answer = -1
            }
        }
        return answer
    }
}