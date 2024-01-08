class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        val odd = num_list.mapIndexed { index, value -> if (index % 2 == 0) value else 0}.sum()
        val even = num_list.mapIndexed { index, value -> if (index % 2 == 1) value else 0}.sum()
        
        answer = if (odd > even) {
            odd
        } else {
            even
        }
        return answer
    }
}