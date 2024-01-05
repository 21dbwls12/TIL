class Solution {
    fun solution(my_string: String, is_suffix: String): Int {
        var answer: Int = 0
        val list: MutableList<String> = mutableListOf()

        for (i in my_string.indices) {
            list.add(my_string.substring(i))
        }

        if (list.contains(is_suffix)) {
            answer = 1
        }

        return answer
    }
}