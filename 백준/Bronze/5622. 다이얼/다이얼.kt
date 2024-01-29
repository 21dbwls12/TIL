fun main() {
    val number = readln()
    var sum = 0

    for (a in number) {
        sum += when (a) {
            'A', 'B', 'C' -> 3
            'D', 'E', 'F' -> 4
            'G', 'H', 'I' -> 5
            'J', 'K', 'L' -> 6
            'M', 'N', 'O' -> 7
            'P', 'Q', 'R', 'S' -> 8
            'T', 'U', 'V' -> 9
            else -> 10
        }
    }
    print(sum)
}