class Solution {
    fun solution(myString: String, pat: String): String {
        var answer: String = myString

        for (i in 1 .. myString.length) {
            if(!answer.endsWith(pat)) {
                answer = answer.take((myString.length) - i)
            }
        }
        return answer
    }
}

// for (s in myString) {
//     if (!answer.endsWith(pat)) {
//         answer += s
//     }
// }
// 이렇게 하면 "AAAAaaaa", "a" 처럼 중복된 경우는 실패함.
// 추가하는 방식으로 할려면 빼는 것보다 더 복잡하게 짜야할 듯