fun main() {
    val input = readln()
    var count = 0
    var i = input.length - 1

    while (i >= 0) {
        if (i == 0) {
            count++
            break
        } else {
            val previous = input[i - 1]
            when (input[i]) {
                '=' -> if (i != 1 && previous == 'z' && input[i - 2] == 'd') {
                    i -= 2
                } else if (previous == 'c' || previous == 's' || previous == 'z') {
                    i--
                }

                '-' -> if (previous == 'c' || previous == 'd') {
                    i--
                }

                'j' -> if (previous == 'l' || previous == 'n') {
                    i--
                }
            }
            count++
            i--
        }
    }
    print(count)
}