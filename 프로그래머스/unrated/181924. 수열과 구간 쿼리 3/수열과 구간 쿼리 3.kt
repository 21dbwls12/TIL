class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr.copyOf()

        for(query in queries) {
            val (i, j) = query
            answer[i] = answer[j].also {answer[j] = answer[i]}
        }

        return answer
    }
}

"""
copyOf()말고 clone()사용해도 됨
2차원 배열은 
val copiedArr = Array(secondArrays.size){idx-> secondArrays[idx].copyOf()}
또는
반복문으로 복제해주어야함
"""
