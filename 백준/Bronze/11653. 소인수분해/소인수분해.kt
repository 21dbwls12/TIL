fun main() {
    var n = readln().toInt()
    var divisor = 2
    val list = mutableListOf<Int>()

    while (n > 1) {
        if (n % divisor == 0) {
            list.add(divisor)
            n /= divisor
        } else {
            divisor++
        }
    }
    list.forEach {
        println(it)
    }
}