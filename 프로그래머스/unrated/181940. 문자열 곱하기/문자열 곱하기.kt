class Solution {
    fun solution(my_string: String, k: Int): String {
        var answer: String = ""
        
        answer = my_string.repeat(k)
        
        return answer
    }
}

"""
.repeat() < forEach < for문
근데 찾아보니깐 .repeat()도 안에 for문으로 이루어져있다는데 왜 직접 for문으로 로직을 짜는 것과 차이가 2배 이상나는지 모르겠음.
.repeat()의 로직이 어떻게 구현되는지는 찾지 못함.

stringBuilder는 0.05ms
"""
