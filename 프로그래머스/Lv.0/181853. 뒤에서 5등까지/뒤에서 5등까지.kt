class Solution {
    fun solution(num_list: IntArray): IntArray {
        val answer: IntArray = num_list.sorted().take(5).toIntArray()
        
        return answer
    }
}
