class Solution {
    fun solution(myString: String): String {
        var answer = StringBuilder(myString)
        val beforeL = 'a' .. 'k'

        for (i in answer.indices) {
            if(answer[i] in beforeL) {
                answer[i] = 'l'
            }
        }
        return answer.toString()
    }
}