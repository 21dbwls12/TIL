fun main() {
    // 2. 메모리 = 37036 KB, 시간 = 476 ms
//    val dot = mutableListOf<List<Int>>()
    val dot = mutableSetOf<List<Int>>()
    val paper = readln().toInt()

    // 1. 메모리 = 46820 KB, 시간 = 572 ms
//    repeat(paper)
    for (n in 1..paper) {
        val (x, y) = readln().split(" ").map { it.toInt() }

        for (i in x .. x + 9) {
            for (j in y .. y + 9) {
                val xy = listOf(i, j)
                if (xy in dot) {
                    continue
                } else {
                    dot.add(xy)
                }
            }
        }
    }
    println(dot.size)
}
