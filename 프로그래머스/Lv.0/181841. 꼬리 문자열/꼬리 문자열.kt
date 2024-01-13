class Solution {
    fun solution(str_list: Array<String>, ex: String): String {
        var answer: String = ""
        
        for (s in str_list) {
            if (!s.contains(ex)) {
                answer += s    
            }
        }
        return answer
    }
}