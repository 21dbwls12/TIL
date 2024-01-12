class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = num_list.sorted().drop(5).toIntArray()
        
        return answer
    }
}