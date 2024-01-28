fun main() {
    val n = readln().toInt()
    val num = readln().chunked(1).sumOf { it.toInt() }

    print(num)
}