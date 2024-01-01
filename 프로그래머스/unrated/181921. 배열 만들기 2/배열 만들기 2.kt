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