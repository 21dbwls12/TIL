class Solution {
    fun solution(binomial: String): Int {
        var answer: Int = 0
        val list = binomial.split(" ")
        val a = list[0].toInt()
        val b = list[2].toInt()

        answer = when (list[1]) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            else -> a / b
        }
        return answer
    }
}