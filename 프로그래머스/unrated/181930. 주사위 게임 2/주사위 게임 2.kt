class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        var answer: Int = 0
        var sum = a + b + c
        var squre = a * a + b * b + c * c
        var cube = a * a * a + b * b * b + c * c * c
        
        if(a == b && b == c) {
            answer = sum * squre * cube
        } else if( a != b && b != c && a != c) {
            answer = sum
        } else {
            answer = sum * squre
        }
        
        return answer
    }
}