// 1번
class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer: Int = 0
        var condition: Boolean = false

        when {
            ineq == ">" && eq == "=" -> condition = n >= m
            ineq == "<" && eq == "=" -> condition = n <= m
            ineq == ">" && eq == "!" -> condition = n > m
            ineq == "<" && eq == "!"-> condition = n < m
        }
        
        answer = if(condition) {
            1
        } else {
            0
        }

        return answer
    }
}

// 2번
class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer: Int = 0
        var condition: Boolean = false

        if(ineq == ">") {
            if(eq == "=") {
                condition = n >= m
            } else {
                condition = n > m
            }
        } else {
            if(eq == "=") {
                condition = n <= m
            } else {
                condition = n < m
            }
        }

        answer = if(condition) {
            1
        } else {
            0
        }

        return answer
    }
}

// 3번
class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer: Int = 0
        var condition: Boolean = false
        
        if(ineq == ">" && eq == "=") {
            condition = n >= m
        } else if(ineq == "<" && eq == "=") {
            condition = n <= m
        } else if(ineq == ">" && eq == "!") {
            condition = n > m
        } else {
            condition = n < m
        }
        
        answer = if(condition) {
            1
        } else {
            0
        }

        return answer
    }
}

"""
비교해봤는데 큰 차이 없음.
비교 이미지는 같은 폴더에 다른 파일에 저장
"""
