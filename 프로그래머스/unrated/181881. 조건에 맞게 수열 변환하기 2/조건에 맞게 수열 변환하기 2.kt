class Solution {
    fun solution(arr: IntArray): Int {
        var answer: Int = 0
        var temp: IntArray

        do {
            temp = arr.clone()
            for (i in arr.indices) {
                arr[i] = when {
                    arr[i] >= 50 && arr[i] % 2 == 0 -> arr[i] / 2
                    arr[i] < 50 && arr[i] % 2 == 1 -> arr[i] * 2 + 1
                    else -> arr[i]
                }
            }
            answer++
        } while (arr.contentEquals(temp).not())
        return answer - 1
    }
}