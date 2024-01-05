class Solution {
    fun solution(my_string: String, is_prefix: String): Int {
        var answer: Int = 0
        
        if (my_string.startsWith(is_prefix)) {
            answer = 1
        }
        
        return answer
    }
}