fun main() {
    val (n, m) = readln().split(" ").map {it.toInt()}
    var list = List(n) { index -> index + 1 }

    for (t in 1 .. m) {
        var (i, j) = readln().split(" ").map { it.toInt() }
        i--
        list = (list.subList(0, i) + list.subList(i, j).reversed() + list.subList(j, n))
    }
    print(list.joinToString(" "))
}