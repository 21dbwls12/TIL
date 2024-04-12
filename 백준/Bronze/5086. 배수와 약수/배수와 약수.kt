import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    while (true) {
        val (i, j) = br.readLine().split(" ").map { it.toInt() }
        // 출력방식에 따른 속도차이
        // https://colabear754.tistory.com/105
        when {
            i == 0 && j == 0 -> break
            j % i == 0 -> bw.write("factor\n")
            i % j == 0 -> bw.write("multiple\n")
            else -> bw.write("neither\n")
        }
    }
    bw.flush()
    bw.close()
}