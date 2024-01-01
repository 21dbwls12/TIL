// 1번
class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = intArrayOf()

        for(num in l .. r) {
            var control = 1
            
            for(n in num.toString()) {
                if(n != '5' && n != '0') {
                    control = 0
                    break
                } 
            }
            if(control == 1) {
                answer += num
            }
        }

        if(answer.isEmpty()) {
            answer += -1
        }

        return answer
    }
}

"""
테스트 10에서 처리 속도가 100.ms가 나와서 다른 방법으로 찾아보았음
조건문을 많이 사용해서 break문을 이용해서 빠져나온 것 자체를 구분할 수 있는 방법을 찾아봄
해당 방법은 없었으나 다른 방법을 찾음
처리속도가 모든 테스트에서 줄어든 것은 아니었고 늘어난 것도 있긴했으나 써본적은 처음이라 적음
"""

// 2번
class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = intArrayOf()

        for(num in l .. r) {
            run check@ {
                for(n in num.toString()) {
                    if(n != '5' && n != '0') {
                        return@check
                    }
                }
            answer += num
            }
        }

        if(answer.isEmpty()) {
            answer += -1
        }

        return answer
    }
}
