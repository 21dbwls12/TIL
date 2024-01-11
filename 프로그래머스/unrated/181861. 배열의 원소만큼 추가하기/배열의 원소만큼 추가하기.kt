class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (n in arr) {
            for (r in 0 .. n - 1)
                answer = answer.plus(n) 
        }
        return answer
    }
}

"""
다른 사람 풀이
class Solution {
    fun solution(arr: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        arr.forEach { a -> repeat(a) { answer.add(a) } }
        return answer.toIntArray()
    }
}

class Solution {
    fun solution(arr: IntArray) = mutableListOf<Int>().apply {
        arr.forEach { num -> repeat(num) { add(num) } }
    }
}

repeat사용하고 싶었는데 안돼서 사용못했는데 다른 사람들은 됐음..?
"""
