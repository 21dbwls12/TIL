fun main() {
    val n = readln().toInt()
    var dot = 2

    for (i in 1 .. n) {
        dot += dot - 1
    }
    println(dot * dot)
}