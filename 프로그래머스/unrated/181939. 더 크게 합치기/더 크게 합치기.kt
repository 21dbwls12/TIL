class Solution {
   fun solution(a: Int, b: Int): Int {
       var answer = ""
       var ab = "$a$b"
       var ba = "$b$a"

       if(ab > ba) {
           answer = ab
       } else if(ab < ba) {
           answer = ba
       } else {
           answer = ab
       }

       return answer.toInt()
   }
}

"""
max함수 사용하면 직접 비교하지 않아도 됨

다른 사람들의 풀이법
import kotlin.math.max

class Solution {
    fun solution(a: Int, b: Int) = max("$a$b".toInt(), "$b$a".toInt())
}

처음 주어진 answer가
var answer: Int = 0
이어서 string값으로 변환하지 않고 로직을 작성하고 싶었음. 방법을 찾지 못함.
"""
