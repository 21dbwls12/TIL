class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): List<Int> {
        var answer: IntArray = intArrayOf()
        
        for (num in intStrs) {
            answer += num.substring(s, l + s).toInt()
        }
        return answer.filter {it > k}
    }
}

// filter함수 사용하지 않고 조건에 맞는 숫자만 answer에 추가하는 방식
// 메모리 용량과 처리속도를 줄일 수 있음.
class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): MutableList<Int> {
        val answer: MutableList<Int> = mutableListOf()
        
        for (num in intStrs) {
            val n = num.substring(s, l + s).toInt()
            if (n > k) {
                answer.add(n)
            }
        }
        return answer
    }
}
