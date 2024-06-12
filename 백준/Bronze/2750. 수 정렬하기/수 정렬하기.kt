fun main() {
    val n = readln().toInt()
    val list = mutableListOf<Int>()
    var switch = false

    repeat(n) {
        val input = readln().toInt()
        list.add(input)
    }
    for (turn in n - 1 downTo 0) {
        var ti = 0
        var t = list[ti]
        for (i in 1..turn) {
            if (t > list[i]) {
                list[i] = list[ti].also { list[ti] = list[i] }
                switch = true
            }
            ti++
            t = list[ti]
        }
        if (!switch) {
            break
        }
    }
    list.forEach { println(it) }
}