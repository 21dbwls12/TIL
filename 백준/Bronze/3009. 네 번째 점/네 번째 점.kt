fun main() {
    val xList = mutableListOf<Int>()
    val yList = mutableListOf<Int>()

    repeat(3) {
        val (x, y) = readln().split(" ").map { it.toInt() }

        xList.add(x)
        yList.add(y)
    }
    val xMap = xList.groupingBy { it }.eachCount()
    val yMap = yList.groupingBy { it }.eachCount()
    var x = xMap.filter { it.value == xMap.values.min() }.keys.toString()
    var y = yMap.filter { it.value == yMap.values.min() }.keys.toString()

    x = x.substring(1, x.length - 1)
    y = y.substring(1, y.length - 1)
    print("$x $y")
}