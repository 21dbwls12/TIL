fun main() {
    val n = readln().toInt()
    val xList = mutableListOf<Int>()
    val yList = mutableListOf<Int>()
    var area = 0

    repeat(n) {
        val (x, y) = readln().split(" ").map { it.toInt() }

        xList.add(x)
        yList.add(y)
    }
    if (n != 0) {
        val x = xList.max() - xList.min()
        val y = yList.max() - yList.min()

        area = x * y
    }
    print(area)
}