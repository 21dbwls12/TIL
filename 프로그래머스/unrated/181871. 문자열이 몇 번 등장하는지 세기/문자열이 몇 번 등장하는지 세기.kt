class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
        val list = myString.windowed(pat.length, 1)
        
        for (l in list) {
            if(l == pat) {
                answer++
            }
        }
        return answer
    }
}