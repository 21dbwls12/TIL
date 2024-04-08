fun main() {
    val x = readln().toInt()
    val upDown = mutableListOf(-1, 1)
    val fraction = mutableListOf(1, 1)
    var n = 1
    var nCount = n

    if (x != 1) {
        for (c in 2..x) {
            if (nCount == 0) {
                n++
                nCount = n
                upDown[0] *= -1
                upDown[1] *= -1
            }
            fraction[0] = maxOf(1, fraction[0] + upDown[0])
            fraction[1] = maxOf(1, fraction[1] + upDown[1])
            nCount--
        }
    }
    println("${fraction[0]}/${fraction[1]}")
}