class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        var answer: Array<String> = strArr
        
        for (i in answer.indices) {
            strArr[i] = if (i % 2 == 0)  {
                strArr[i].lowercase()
            } else {
                strArr[i].uppercase()
            }
        }
        return answer
    }
}