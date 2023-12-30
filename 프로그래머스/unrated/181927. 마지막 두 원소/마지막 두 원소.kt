class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = num_list
        val last = answer[answer.size - 1]
        val secondLast = answer[answer.size - 2]

        if(last > secondLast) {
            answer += (last - secondLast)
        } else {
            answer += last * 2
        }

        return answer
    }
}

"""
신기한 다른 사람 풀이
takeLast() => take 의 반대. 뒤에서 부터 n 개를 취한다

class Solution {
    fun solution(num_list: IntArray): IntArray {
        val answer = num_list.toMutableList().apply {
            val (first, second) = num_list.takeLast(2)
            if (first < second) add(second - first)
            else add(second + second)
        }
        return answer.toIntArray()    
    }
}

찾아보니 take 종류가 다양함
https://kotlinworld.com/12
"""
