class Solution {
    fun solution(myStr: String): Array<String> {
        var answer: Array<String> = myStr.split("a", "b", "c").filter { it.isNotBlank() }.toTypedArray()

        if (answer.isEmpty()) {
            answer = answer.plus("EMPTY")
        }
        return answer
    }
}