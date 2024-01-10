class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = my_string.trim().replace("\\s+".toRegex(), " ").split(" ").toTypedArray()
        
        return answer
    }
}