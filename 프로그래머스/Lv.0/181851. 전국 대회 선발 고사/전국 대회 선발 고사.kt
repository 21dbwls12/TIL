class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        val studentList = rank.zip(attendance.toList()).toMap()
        val studentTrue = studentList.filter { it.value}.keys.sorted().take(3)
        val rank1 = rank.indexOf(studentTrue[0])
        val rank2 = rank.indexOf(studentTrue[1])
        val rank3 = rank.indexOf(studentTrue[2])
        val answer: Int = (10000 * rank1) + (100 * rank2) + rank3

        return answer
    }
}

// mapIndexed쓰면 됐는데... 생각 못 했음..
"""
다른 사람 풀이
class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        val result = rank.mapIndexed { i, v -> i to v }
            .filter { attendance[it.first] }
            .sortedBy { it.second }
        return result[0].first * 10000 + result[1].first * 100 + result[2].first
    }
}

class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        val list = rank.mapIndexed { index, num -> num to index }.sortedBy { it.first }
        return list.filter { attendance[it.second] }
            .take(3)
            .map { it.second }
            .let { 10000 * it[0] + 100 * it[1] + it[2] }
    }
}
"""
