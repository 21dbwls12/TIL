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