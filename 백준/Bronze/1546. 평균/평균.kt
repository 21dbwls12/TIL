fun main() {
    val n = readln().toInt()
    val score = readln().split(" ").map { it.toInt() } as MutableList<Double>
    val m = score.max()

    for (i in 0 ..<n) {
        score[i] = (score[i] / m) * 100
    }
    print(score.average())
}