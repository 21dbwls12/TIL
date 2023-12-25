class Solution {
    fun solution(str1: String, str2: String): String {
        var answer: String = ""
        var count = 0

        while (count < str1.length) {
            answer += str1[count]
            answer += str2[count]
            count++
        }   
        
        return answer
    }
}

"""
다른사람들 풀이 보니깐 .joinToString() 많이 사용함.
.joinToString() 사용예시
fun main() {
   
	var list_data = ArrayList<String>()
	list_data.add("넷")
	list_data.add("다섯")
	list_data.add("여섯")

    // [넷, 다섯, 여섯]
	println("ArrayList 일반 출력 : "+list_data.toString())		
	// {넷:다섯:여섯}
    println("ArrayList 포맷 출력111 : "+list_data.joinToString(":", "{", "}"))
    // 넷:다섯:여섯
    println("ArrayList 포맷 출력222 : "+list_data.joinToString(":"))
    // 넷
       다섯
       여섯
    println("ArrayList 포맷 출력333 : "+list_data.joinToString("\n"))
}

.joinToString() 문제 답(다른 사람 풀이)
1. fun solution(str1: String, str2: String) = str1.zip(str2).joinToString("") { (a, b) -> "$a$b" }
2. str1.indices.joinToString("") { "${str1[it]}${str2[it]}" }
"""
