class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        var answer: IntArray = intervals.map { (a, b) -> arr.slice(a..b) }.flatten().toIntArray()
        
        // for (interval in intervals) {
        //     val (a, b) = interval
        //     answer += arr.slice(a..b)
        // }
        return answer
    }
}