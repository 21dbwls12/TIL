fun main() {
    val table = mutableListOf<List<String>>()

    repeat(5) {
        val input = readln().chunked(1)

        table.add(input)
    }

    val max = table.maxOf { it.size }
    for (i in 0..< max) {
        for (j in table.indices) {
            if (table[j].size > i) {
                print(table[j][i])
            }
        }
    }
}