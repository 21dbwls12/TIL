class Solution {
    fun solution(my_string: String): IntArray {
        val count = my_string.groupingBy { it }.eachCount()
        val am = listOf('A'..'Z', 'a'..'z').flatten()
        val answer: IntArray = am.map { count[it] ?: 0 }.toIntArray()

        return answer
    }
}