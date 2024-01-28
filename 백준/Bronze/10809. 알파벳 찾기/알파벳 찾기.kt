fun main() {
    val s = readln()
    // map 맏들어짐 {a=-1, b=-1, c=-1, ...}
    val list = ('a' .. 'z').associateWith { -1 }.toMutableMap()

    for ((i, c) in s.withIndex()) {
        if (list[c] == -1) {
            list[c] = i
        }
    }
    print (list.values.joinToString(" "))
}