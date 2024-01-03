class Solution {
    fun solution(my_string: String, index_list: IntArray): String {
        var answer = StringBuilder()
        
        for (i in index_list) {
            answer.append(my_string[i])
        }
        
        return answer.toString()
    }
}
