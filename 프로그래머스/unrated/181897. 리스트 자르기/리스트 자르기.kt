class Solution {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        val (a, b, c) = slicer

        val answer = when (n) {
            1 -> num_list.slice(0 .. b)
            2 -> num_list.slice(a .. num_list.size - 1)
            3 -> num_list.slice(a .. b)
            else -> num_list.slice(a .. b step c)
        }
        return answer.toIntArray()
    }
}