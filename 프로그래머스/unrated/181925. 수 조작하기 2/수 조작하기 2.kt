class Solution {
    fun solution(numLog: IntArray): String {
        var answer = StringBuilder()
        var before = numLog[0]
        
        for(i in 1 .. numLog.size - 1) {
            when(numLog[i] - before) {
                1 -> answer.append("w")
                -1 -> answer.append("s")
                10 -> answer.append("d")
                -10 -> answer.append("a")
            }
            before = numLog[i]
        }
        
        return answer.toString()
    }
}