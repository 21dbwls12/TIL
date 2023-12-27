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
-> '앞 피연산자에 뒤 피연산자 자릿수만큼 * 해주면 되지 않을까요. 자릿수는 나누기나 상용로그 이용해서 구하면 되지않을까 싶네요'

ab와 ba가 같을 경우 ab를 출력하기때문에 조건문을 >= 을 사용해서 2개만 사용하면 더 좋을 것 같다는 피드백이 있었음.
"""
