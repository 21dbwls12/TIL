class Solution {
    fun solution(myString: String): Array<String> {
        val answer: Array<String> = myString.trim().split("x").filter { it.isNotBlank() }.sorted().toTypedArray()
        
        return answer
    }
}