fun main() {
    val students = mutableListOf<Int>()
    var count = 0

    repeat(28) {
        val student = readln().toInt()
        students.add(student)
    }
    for (i in 1 .. 30) {
        if (!students.contains(i)) {
            println(i)
            count++
        }
        if (count == 2) {
            break
        }
    }
}