class Solution {
    fun solution(strArr: Array<String>): Int {
        val size = strArr.groupingBy { it.length }.eachCount()
        val answer: Int = size.values.maxOf { it }


        return answer
    }
}
