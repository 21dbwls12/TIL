class Solution {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        for (line in picture) {
            var temp = ""
            line.forEach { temp += it.toString().repeat(k) }
            for (i in 0 .. k - 1) {
                answer = answer.plus(temp)   
            }
        }
        return answer
    }
}