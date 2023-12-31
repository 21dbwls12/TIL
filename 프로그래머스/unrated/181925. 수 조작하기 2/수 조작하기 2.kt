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

"""
다른 사람의 풀이
map도 사용
class Solution {
    fun solution(numLog: IntArray): String {
        val map = mapOf(1 to "w", -1 to "s", 10 to "d", -10 to "a")
        var n = numLog[0]
        return numLog.slice(1..numLog.lastIndex)
            .joinToString("") { num -> map.getValue(num - n).also { n = num } }
    }
}
"""
