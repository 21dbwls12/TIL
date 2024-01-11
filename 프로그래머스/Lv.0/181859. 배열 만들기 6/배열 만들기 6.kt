import java.util.Stack

class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = Stack<Int>()
        var i = 0
        
        while (i < arr.size) {
            if (answer.isEmpty()) {
                answer.push(arr[i])
            } else {
                if (answer.peek() == arr[i]) {
                    answer.pop()
                } else {
                    answer.push(arr[i])
                }
            }
            i++
        }
        if (answer.isEmpty()) {
            answer.push(-1)
        }
        return answer.toIntArray()
    }
}