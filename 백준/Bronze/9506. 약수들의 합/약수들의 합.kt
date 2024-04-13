import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val n = br.readLine().toInt()
        val list = mutableListOf<Int>()
        var total = 0

        if (n == -1) {
            break
        }
        for (i in 1 ..< n) {
            if (n % i == 0) {
                list.add(i)
                total += i
            }
        }
        if (total == n) {
            bw.write("$n = ")
            list.forEachIndexed { i, it  ->
                if (i != list.size - 1) {
                    bw.write("$it + ")
                } else {
                    bw.write("$it")
                }
            }
        } else {
            bw.write("$n is NOT perfect.")
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}