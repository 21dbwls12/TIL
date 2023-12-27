class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        if(n % 2 != 0) {
            for (e in 1 .. n step 2) {
                answer += e
            } 
        } else {
            for (e in 2 .. n step 2) {
                answer += e * e
            }
        }
        
        return answer
    }
}

"""
최대 -> 0.39ms, 최소 -> 0.23ms
"""

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0

        if(n % 2 != 0) {
            for (e in 1 .. n) {
                if(e % 2 != 0) {
                    answer += e
                } else {
                    continue
                }
            }
        } else {
            for (e in 1 .. n) {
                if(e % 2 == 0) {
                    answer += e * e
                } else {
                    continue
                }
            }
        }

        return answer
    }
}

"""
최대 -> 0.03ms, 최소 -> 0.01ms
처음에 이걸로 하고 위에 step 사용해서 했는데 내가 생각했던 것과 달리 처음에 짠 로직이 시간이 덜 걸렸음..?
내장 함수가 더 오래 걸리는 듯.. 잘 모르겠음..
"""
