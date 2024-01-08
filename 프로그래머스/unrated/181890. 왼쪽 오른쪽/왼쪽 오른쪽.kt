class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        for (i in str_list.indices) {
            when (str_list[i]) {
                "l" -> {
                    answer = str_list.slice(0..i - 1).toTypedArray()
                    break
                }
                "r" -> {
                    answer = str_list.slice(i + 1 .. str_list.size - 1).toTypedArray()
                    break
                }
            }
        }
        return answer
    }
}