fun main() {
    val table = mutableListOf<List<Int>>()
    var temp = -1
    var index = ""

    repeat(9) {
        val line = readln().split(" ").map { it.toInt() }

        table.add(line)
    }
    for (i in table.indices) {
//        val max = table[i].max()
//        if (temp < max) {
//            temp = max
//            index = "${i + 1} ${table[i].indexOf(max) + 1}"
//        }
        for (j in table[i].indices) {
            val number = table[i][j]
            if (temp < number) {
                temp = number
                index = "${i + 1} ${j + 1}"
            }
        }
    }
    println(temp)
    print(index)
}