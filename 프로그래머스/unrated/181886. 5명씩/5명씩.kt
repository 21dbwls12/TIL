class Solution {
    fun solution(names: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        for (i in names.indices step 5) {
            answer = answer.plus(names[i])
        }
        return answer
    }
}