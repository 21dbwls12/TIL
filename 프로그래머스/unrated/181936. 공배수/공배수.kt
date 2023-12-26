class Solution {
    fun solution(number: Int, n: Int, m: Int): Int {
        var answer: Int = 0
        
        if(number % n == 0) {
            if(number % m == 0) {
                answer = 1
            } else {
                answer = 0
            }
        } else {
            answer = 0
        }
        
        return answer
    }
}

"""
다른 사람 풀이법
1. answer는 이미 0으로 초기화되어있어서 굳이 다시 answer에 0을 할당하지 않아도 됐을 듯
2. && 연산자 쓰면 되는데 왜 if문 2개 썻지..? 너무 생각안하고 푼 듯
"""
