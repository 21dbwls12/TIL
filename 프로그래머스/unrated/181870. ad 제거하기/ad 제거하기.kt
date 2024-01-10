class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        val part = "ad"
        val answer: Array<String> = strArr.filter { !it.contains(part) }.toTypedArray()
        
        return answer
    }
}