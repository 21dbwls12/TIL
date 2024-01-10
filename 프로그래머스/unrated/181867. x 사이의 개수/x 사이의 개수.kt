class Solution {
    fun solution(myString: String): IntArray {
        var list = myString.split("x")
        var answer: IntArray = list.map { it.length }.toIntArray()
        
        return answer
    }
}