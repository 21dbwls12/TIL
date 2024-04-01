fun main() {
    val dot = mutableListOf<List<Int>>()
    val paper = readln().toInt()

    for(n in 1 .. paper) {
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