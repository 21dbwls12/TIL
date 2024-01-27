fun main() {
    val t = readln().toInt()

    repeat(t) {
        val string = readln()
        val first = string[0]
        val last = string[string.length - 1]

        println("$first$last")
    }
}