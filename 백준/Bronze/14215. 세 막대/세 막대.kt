fun main() {
    val (x, y, z) = readln().split(" ").map { it.toInt() }
    val max = maxOf(x, y, z)
    val others = x + y + z - max
    var round = 0

    round = if (max >= others) {
        others + (others - 1)
    } else {
        x + y + z
    }
    print(round)
}