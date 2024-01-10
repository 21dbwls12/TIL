class Solution {
    fun solution(rny_string: String): String {
        var answer: String = ""
        
        for (s in rny_string) {
            answer += if (s == 'm') {
                "rn"
            } else {
                s
            }
        }
        return answer
    }
}