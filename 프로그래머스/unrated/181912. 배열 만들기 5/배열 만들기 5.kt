class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): List<Int> {
        var answer: IntArray = intArrayOf()
        
        for (num in intStrs) {
            answer += num.substring(s, l + s).toInt()
        }
        return answer.filter {it > k}
    }
}