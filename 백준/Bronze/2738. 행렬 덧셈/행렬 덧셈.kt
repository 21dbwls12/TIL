fun main() {
    val setting = readln().split(" ").map { it.toInt()}
    val array1 = mutableListOf<List<Int>>()
    val array2 = mutableListOf<List<Int>>()

    repeat(setting[0]) {
        val input = readln().split(" ").map { it.toInt() }
        array1.add(input)
    }
    repeat(setting[0]) {
        val input = readln().split(" ").map { it.toInt() }
        array2.add(input)
    }
    for (i in array1.indices) {
        for (j in array1[i].indices) {
            print("${array1[i][j] + array2[i][j]} ")
        }
        println()
    }
}