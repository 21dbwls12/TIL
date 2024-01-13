class Solution {
    fun solution(my_string: String, target: String): Int {
        var answer: Int = 0
        
        if (my_string.contains(target)) {
            answer = 1
        }
        return answer
    }
}