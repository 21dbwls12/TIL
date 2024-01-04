class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer = my_string.drop(my_string.length - n)
        
        return answer
    }
}