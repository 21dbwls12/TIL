class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        val f = num_list.slice(0 .. n - 1)
        val s = num_list.slice(n .. num_list.size - 1)
        val answer = s + f

        return answer.toIntArray()
    }
}