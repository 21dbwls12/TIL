fun main() {
    val n = readln().toInt()
    val list = readln().split(" ")
    val v = readln()
    var count = 0

    for (num in list) {
        if (num == v) {
            count++
        }
    }
    print(count)
}