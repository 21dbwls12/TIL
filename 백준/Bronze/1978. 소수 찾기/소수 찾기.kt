fun main() {
    val n = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }
    var count = 0

    list.forEach {
        var divisor = false
        if (it == 1) {
            divisor = true
        } else {
            for (i in 2..<it) {
                if (it % i == 0) {
                    divisor = true
                    break
                }
            }
        }
        if (!divisor)  {
            count++
        }
    }
    println(count)
}