class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
        
        if (myString.lowercase().contains(pat.lowercase())) {
            answer = 1
        }
        return answer
    }
}