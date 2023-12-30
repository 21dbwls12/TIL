class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var sum = 0
        var mul = 1
        
        for (n in num_list) {
            sum += n
            mul *= n
        }
        
        if(sum * sum > mul) {
            answer = 1
        } else {
            answer = 0
        }
        
        return answer
    }
}