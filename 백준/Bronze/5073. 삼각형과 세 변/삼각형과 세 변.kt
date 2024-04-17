import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val (x, y, z) = br.readLine().split(" ").map { it.toInt() }
        val max = maxOf(x, y, z)
        val others = x + y + z - max
        var answer = ""

        if (x == 0 && y == 0 && z == 0) {
            break
        }
        answer = if (max >= others) {
            "Invalid"
        } else {
            if (x == y && y == z) {
                "Equilateral"
            } else if (x == y || y == z || x == z) {
                "Isosceles"
            } else {
                "Scalene"
            }
        }
        bw.write("$answer\n")
    }
    bw.flush()
    bw.close()
}