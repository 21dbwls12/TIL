fun main() {
    val m = readln().toInt()
    val n = readln().toInt()
    val list = mutableListOf<Int>()

    for (i in m .. n) {
        var prime = true
        if (i != 1) {
            for (j in 2 ..< i) {
                if (i % j == 0) {
                    prime = false
                    break
                }
            }
            if (prime) {
                list.add(i)
            }
        }
    }
    if (list.isNotEmpty()) {
        println(list.sum())
        print(list[0])
    } else {
        print(-1)
    }
}