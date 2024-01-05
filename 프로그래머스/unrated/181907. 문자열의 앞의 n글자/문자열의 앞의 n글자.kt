class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = my_string.dropLast(my_string.length - n)
        
        return answer
    }
}