fun main() {
    val n = readln().toInt()
    var pack = n / 5
    var sugar = n % 5

    while (sugar in 1..n) {
        if (sugar % 3 != 0) {
            pack--
            sugar += 5
        } else {
            pack += sugar / 3
            sugar = 0
        }
    }
    println(if (sugar == 0) pack else -1)
}