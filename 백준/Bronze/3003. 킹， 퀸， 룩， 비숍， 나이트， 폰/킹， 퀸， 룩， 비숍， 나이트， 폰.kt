fun main() {
    val original = listOf(1, 1, 2, 2, 2, 8)
    val input = readln().split(" ").map { it.toInt() }

    input.forEachIndexed { i, p ->
        print("${original[i] - p} ")
    }
}