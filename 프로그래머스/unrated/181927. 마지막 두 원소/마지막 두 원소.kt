class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = num_list
        val last = answer[answer.size - 1]
        val secondLast = answer[answer.size - 2]

        if(last > secondLast) {
            answer += (last - secondLast)
        } else {
            answer += last * 2
        }

        return answer
    }
}