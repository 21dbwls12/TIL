class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var a = -1
        var b = -1

        for(i in arr.indices) {
            if(arr[i] == 2) {
                if(a == -1) {
                    a = i
                }
                b = i
            }
        }
        answer = if (a != -1) {
            arr.slice(a .. b).toIntArray()
        } else {
            answer.plus(-1)
        }
        return answer
    }
}