class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        // val todo = mapOf(todo_list to finished) -> 이렇게 하면 ket는 todo_list의 배열 전체, value는 finished의 배열 전체가 됨.
        val todo = todo_list.zip(finished.toList()).toMap()
        // filterValues { !it }도 똑같은 결과가 나옴.
        val answer: Array<String> = todo.filter { !it.value }.keys.toTypedArray()
        return answer
    }
}
