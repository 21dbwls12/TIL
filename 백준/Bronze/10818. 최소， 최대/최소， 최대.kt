fun main() {
    val input = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }

    print("${list.min()} ${list.max()}")
}