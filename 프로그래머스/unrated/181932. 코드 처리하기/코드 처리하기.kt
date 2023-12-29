// 1번
class Solution {
    fun solution(code: String): String {
        var ret: String = ""
        var mode = 0

        for (i in code.indices) {
            if (code[i] == '1') {
                mode = 1 - mode
            } else if (code[i] in 'a'..'z') {
                if ((mode == 0 && i % 2 == 0) || (mode == 1 && i % 2 != 0)) {
                    ret += code[i]
                }
            } else {
                continue
            }
        }

        return ret.ifBlank {
            "EMPTY"
        }
    }
}

"""
조금 오래 헤멨는데 문제를 잘 안봤던 것 같음.. 분명 ret이 빈칸일 때, "EMPTY"를 반환하라고 했는데 code가 빈칸일 때 "EMPTY"를 반환하라고 처리해서 계속 실패함.
메모리 용량과 처리속도가 너무 컸음.
 -> continue문 제거하고 += 말고 StringBuilder() 사용
"""

// 2번
class Solution {
    fun solution(code: String): String {
        var ret = StringBuilder()
        var mode = 0

        for (i in code.indices) {
            if (code[i] == '1') {
                mode = 1 - mode
            } else if (code[i] in 'a'..'z') {
                if ((mode == 0 && i % 2 == 0) || (mode == 1 && i % 2 != 0)) {
                    ret.append(code[i])
                }
            }
        }

        return ret.toString().ifBlank {
            "EMPTY"
        }
    }
}

"""
메모리 용량과 처리속도가 확연히 줄었음
이미지는 따로 파일 생성..
"""
