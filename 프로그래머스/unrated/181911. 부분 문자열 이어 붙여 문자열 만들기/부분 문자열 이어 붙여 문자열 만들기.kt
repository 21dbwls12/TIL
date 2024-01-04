class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        
        for (i in my_strings.indices) {
            val (s, e) = parts[i]
            answer += my_strings[i].substring(s, e + 1)
        }
        return answer
    }
}