fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ").map { it.toInt() }
    var blackJack = 0

    loop@ for (i in 0 ..< n - 2) {
        for (j in i + 1 ..< n - 1) {
            for (k in j + 1 ..< n) {
                var temp = list[i] + list[j]
                temp += list[k]
                if (temp == m) {
                    blackJack = temp
                    break@loop
                } else if (temp in (blackJack + 1)..<m) {
                    blackJack = temp
                }
            }
        }
    }
    print(blackJack)
}