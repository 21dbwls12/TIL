fun main() {
    val n = readln().toInt()
    var constructor = 0

    for (i in 1 .. n) {
        var sum = i

        for (j in i.toString()) {
            sum += j.digitToInt()
        }
        if (sum == n) {
            constructor = i
            break
        }
    }
    print(constructor)
}