class Solution {
    fun solution(arr: IntArray): IntArray {
        val answer: IntArray = arr

        for (i in answer.indices) {
            answer[i] = when {
                answer[i] >= 50 && answer[i] % 2 == 0 -> answer[i] / 2
                answer[i] < 50 && answer[i] % 2 == 1 -> answer[i] * 2
                else -> answer[i]
            }
        }
        return answer
    }
}

// for (n in arr) {
//     answer = when {
//         n > 50 && n % 2 == 0 -> answer.plus(n / 2)
//         n < 50 && n % 2 == 1 -> answer.plus(n * 2)
//         else -> answer.plus(n)
//     }
// }
// 이런식으로 하니깐 (4169.30ms, 466MB)까지 나옴