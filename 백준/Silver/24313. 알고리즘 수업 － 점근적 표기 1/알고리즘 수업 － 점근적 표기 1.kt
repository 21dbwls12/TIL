fun main() {
    val (a1, a0) = readln().split(" ").map { it.toInt() }
    val c = readln().toInt()
    val n0 = readln().toInt()
    var isSatisfied = 1

    for (n in n0 .. 100) {
        if (a1 * n + a0 > c * n ) {
            isSatisfied = 0
        }
    }
    print(isSatisfied)
}