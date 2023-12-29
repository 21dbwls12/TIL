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