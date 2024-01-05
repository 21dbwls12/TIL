class Solution {
    fun solution(my_string: String): MutableList<String> {
        val answer: MutableList<String> = mutableListOf()

        for (i in my_string.indices) {
            answer.add(my_string.substring(i))
        }
        answer.sort()
        return answer
    }
}