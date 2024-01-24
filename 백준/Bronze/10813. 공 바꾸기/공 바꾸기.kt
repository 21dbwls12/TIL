fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val baskets = MutableList(n) { index -> index + 1 }

    for (b in 1 .. m) {
        var (i, j) = readln().split(" ").map { it.toInt() }
        i--
        j--
        baskets[i] = baskets[j].also { baskets[j] = baskets[i] }
    }
    print(baskets.joinToString(" "))
}