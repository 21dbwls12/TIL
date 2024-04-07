fun main() {
    val n = readln().toInt()
    var range: IntRange = 1 .. 1
    var room = 1

    while (!range.contains(n)) {
        val last = range.last
        range = last .. (last + (6 * room))
        room++
    }
    println(room)
}