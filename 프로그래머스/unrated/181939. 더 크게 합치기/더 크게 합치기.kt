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
"""
