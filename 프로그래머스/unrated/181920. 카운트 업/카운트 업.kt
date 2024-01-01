// 1번
class Solution {
    fun solution(start_num: Int, end_num: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        for(n in start_num .. end_num) {
            answer = answer.plus(n)
        }
        
        return answer
    }
}

"""
이게 간단한 거라서 1.ms를 넘어가면 안되는 거라고 생각함
생각하다보니 for문을 저렇게 안넣고 answer에 바로 집어넣을 수 있지 않을까 생각함
근데 IntArray(start_num .. end_num)이거는 IntRange로 타입이 지정됨
전에 list는 되었던 거 같아서 그거 찾다가 아래 방법을 찾음

var list = (1 .. 10).toList()
이거는 됨... 왜 toIntArray()는 안되는지 모르겠음..
오..? var list = (1 .. 10).toList().toIntArray() 이거 됨...
7.ms에서 12.ms사이, 형변환을 2번이나해서 늘어난 듯
"""

// 2번
class Solution {
    fun solution(start_num: Int, end_num: Int): IntArray {
        val answer = IntArray(end_num - start_num + 1) { it + start_num }

        return answer
    }
}
