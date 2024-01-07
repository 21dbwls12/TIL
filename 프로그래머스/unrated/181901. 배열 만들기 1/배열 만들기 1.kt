class Solution {
    fun solution(n: Int, k: Int): IntArray {
        val answer: IntArray = listOf(1 .. n).flatten().filter { it % k == 0}.toIntArray()
        
        return answer
    }
}