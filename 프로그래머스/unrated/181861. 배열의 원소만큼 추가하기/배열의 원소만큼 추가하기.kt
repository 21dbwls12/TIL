class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (n in arr) {
            for (r in 0 .. n - 1)
                answer = answer.plus(n) 
        }
        return answer
    }
}