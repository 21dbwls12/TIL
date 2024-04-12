fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    var count = 0

    for (i in 1 .. n) {
        if (n % i == 0) {
            count++
        }
        if (count == k) {
            count = i
            break
        }
    }
    if (count < k) {
        count = 0
    }
    println(count)
}