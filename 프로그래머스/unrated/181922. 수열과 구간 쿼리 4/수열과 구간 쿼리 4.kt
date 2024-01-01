class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        
        for(query in queries) {
            val (s, e, k) = query
            
            for(i in s .. e) {
                if(i % k == 0) {
                    arr[i] += 1
                }
            }
        }
        
        return arr
    }
}