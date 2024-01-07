class Solution {
    fun solution(my_string: String, indices: IntArray): String {
        val answer: String = my_string.filterIndexed { index, _ -> !indices.contains(index) }

//        for(i in my_string.indices) {
//            if (!indices.contains(i)) {
//                answer += my_string[i]
//            }
//        }
        return answer
    }
}