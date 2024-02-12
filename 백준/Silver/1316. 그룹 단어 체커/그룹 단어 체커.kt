fun main() {
    val number = readln().toInt()
    var groupWord = 0

    loop@ for (i in 1..number) {
        val word = readln()
        var temp = ' '
        val alphabet = mutableListOf<Char>()

        for (c in word) {
            if (c != temp) {
                if (c in alphabet) {
                    continue@loop
                } else {
                    alphabet.add(c)
                    temp = c
                }
            }
        }
        groupWord++
    }
    print(groupWord)
}