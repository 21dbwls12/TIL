class Solution {
    fun solution(start_num: Int, end_num: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        for(n in start_num .. end_num) {
            answer = answer.plus(n)
        }
        
        return answer
    }
}