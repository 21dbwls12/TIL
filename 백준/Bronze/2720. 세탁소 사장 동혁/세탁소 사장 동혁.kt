fun main() {
    val t = readln().toInt()
    val coins = listOf(25, 10, 5, 1)

    for (case in 1 .. t) {
        var c = readln().toInt()

        for (coin in coins) {
            print(c / coin)
            print(" ")
            c %= coin
        }
        println("")
    }
}