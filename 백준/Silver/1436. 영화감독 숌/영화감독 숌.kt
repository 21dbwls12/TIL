fun main() {
    val n = readln().toInt()
    var movieN = 665
    var count = 0


    for (mn in movieN..Int.MAX_VALUE) {
        var sixCount = 0
        for (a in mn.toString()) {
            if (a == '6') {
                sixCount++
            } else {
                sixCount = 0
            }
            if (sixCount == 3) {
                break
            }
        }
        if (sixCount >= 3) {
            count++
        }
        if (count == n) {
            break
        }
        movieN++
    }
    print(movieN)
}