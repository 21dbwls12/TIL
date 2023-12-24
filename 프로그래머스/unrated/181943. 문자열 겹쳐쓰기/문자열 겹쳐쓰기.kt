class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""

        answer = my_string.substring(0.. s - 1) + overwrite_string + my_string.substring(s + overwrite_string.length)

        return answer
    }
}

"""
입력값과 출력값에 ""가 있어서 헷갈렸음
저 입력값이 코드상으로 주어지는(?) 값이라서 var a = "hi"와 같은 것임
"""
