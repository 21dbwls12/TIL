class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        val size1 = arr1.size
        val size2 = arr2.size

        val answer = when {
            size1 > size2 -> 1
            size1 < size2 -> -1
            else -> sumDifference(arr1, arr2)
        }
        return answer
    }

    private fun sumDifference(arr1: IntArray, arr2: IntArray): Int {
        val sum1 = arr1.sum()
        val sum2 = arr2.sum()

        val answer: Int = when {
            sum1 > sum2 -> 1
            sum1 < sum2 -> -1
            else -> 0
        }
        return answer
    }
}