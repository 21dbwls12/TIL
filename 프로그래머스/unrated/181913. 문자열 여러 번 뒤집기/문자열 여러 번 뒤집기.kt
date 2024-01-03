class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = my_string
        
        for (query in queries) {
            var (s, e) = query
            e = e + 1
            
            var temp = answer.substring(s, e).reversed()
            answer = answer.replaceRange(s, e, temp)
        }
        return answer
    }
}