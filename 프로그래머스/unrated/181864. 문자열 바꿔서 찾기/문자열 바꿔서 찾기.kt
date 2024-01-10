class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
        var after = ""

        for (s in myString) {
            after += if (s =='A') {
                'B'
            } else {
                'A'
            }
        }
        answer = if(after.contains(pat)) {
            1
        } else {
            0
        }
        return answer
    }
}
