class Solution {
    fun solution(number: String): Int {
        var sum = 0

        for (n in number) {
            sum += n.toString().toInt()
        }
        return sum % 9
    }
}