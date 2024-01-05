class Solution {
    fun solution(my_string: String, is_suffix: String): Int {
        var answer: Int = 0
        val list: MutableList<String> = mutableListOf()

        for (i in my_string.indices) {
            list.add(my_string.substring(i))
        }

        if (list.contains(is_suffix)) {
            answer = 1
        }

        return answer
    }
}

// 다른 사람 풀이
// startsWith, endsWith => 특정 문자로 시작, 종료하는지 확인하는 내장 함수
class Solution {
    fun solution(myString: String, isSuffix: String) = if (myString.endsWith(isSuffix)) 1 else 0
}
