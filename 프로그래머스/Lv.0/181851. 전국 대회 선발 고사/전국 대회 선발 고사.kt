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
