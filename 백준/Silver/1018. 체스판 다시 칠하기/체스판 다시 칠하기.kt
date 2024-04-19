import kotlin.math.min

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val board = mutableListOf<List<String>>()
    var min = 64

    for (i in 1 .. n) {
        val line = readln().chunked(1)
        board.add(line)
    }
    // 첫번째 y
    for (r in 0 ..m - 8) {
        // 첫번째 x
        for (c in 0 .. n - 8) {
            var whitePaint = true
            var blackPaint = false
            var blackCount = 0
            var whiteCount = 0

            for (lineC in c .. c + 7) {
                for (lineR in r..r + 7) {
                    var oldPaint = false

                    when (board[lineC][lineR]) {
                        "W" -> oldPaint = true
                        "B" -> oldPaint = false
                    }
                    if (whitePaint != oldPaint) {
                        whiteCount++
                    }
                    if (blackPaint != oldPaint) {
                        blackCount++
                    }
                    if (lineR != r + 7) {
                        whitePaint = !whitePaint
                        blackPaint = !blackPaint
                    }
                }
            }
            val minWB = min(whiteCount, blackCount)

            if (minWB < min) {
                min = minWB
            }
        }
    }
    print(min)
}
