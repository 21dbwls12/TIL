class Solution {
    fun solution(arr: IntArray, delete_list: IntArray): IntArray {
        val answer: IntArray = arr.filter { !delete_list.contains(it) }.toIntArray()
        return answer
    }
}