class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        
        for (query in queries) {
            val (s, e) = query
            
            arr.forEachIndexed { i, _ ->
                if (i in s .. e) {
                    arr[i]++
                }
            }
        }
        return answer
    }
}