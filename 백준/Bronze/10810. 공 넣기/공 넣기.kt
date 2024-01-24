fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val baskets = MutableList(n) { 0 }

    for (b in 1 .. m) {
        var (i, j, k) = readln().split(" ").map { it.toInt() }
        i--
        j--

        for (x in i .. j) {
            baskets[x] = k
        }
    }
    print(baskets.joinToString(" "))
}