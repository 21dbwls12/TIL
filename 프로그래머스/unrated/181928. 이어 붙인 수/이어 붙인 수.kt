class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        val odd = StringBuilder()
        val even = StringBuilder()

        for(n in num_list) {
            if(n % 2 != 0) {
                odd.append(n)
            } else {
                even.append(n)
            }
        }

        answer = odd.toString().toInt() + even.toString().toInt()

        return answer
    }
}