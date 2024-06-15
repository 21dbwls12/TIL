import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val counting = MutableList(10001) {0}
    val n = br.readLine().toInt()
    var i = 0
    var count = 0

    repeat(n) {
        val input = br.readLine().toInt()
        counting[input] += 1
    }
    while (true) {
        if (counting[i] == 0) {
            i++
        } else {
            bw.write("$i\n")
            counting[i] -= 1
            count++
        }
        if (count >= n) {
            break
        }
    }
    bw.flush()
    bw.close()
}