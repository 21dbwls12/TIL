fun main() {
    var max = 0
    var line = 0

    for (i in 1.. 9) {
        val n = readln().toInt()

        if (n > max) {
            max = n
            line = i
        }
    }
    println(max)
    print(line)
}