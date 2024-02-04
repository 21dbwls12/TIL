fun main() {
    val input = readln().toInt()
    val line = (input * 2) - 1

    printStars(line, line / 2, true)
    printStars(line, 1, false)

//    var mid = line / 2
//
//    for (i in 1 .. line step 2) {
//        val output = StringBuilder(" ".repeat(line))
//
//        output.forEachIndexed { index, _ ->
//            if (index >= mid && index < mid + i) {
//                output[index] = '*'
//            }
//        }
//        mid--
//        println(output.toString())
//    }
//    mid = 1
//    for (i in line - 2 downTo 1 step 2) {
//        val output = StringBuilder(" ".repeat(line))
//
//        output.forEachIndexed { index, _ ->
//            if (index >= mid && index < mid + i) {
//                output[index] = '*'
//            }
//        }
//        mid++
//        println(output.toString())
//    }
}

fun printStars(line: Int, middle: Int, isUp: Boolean) {
    var mid = middle
    val range = if (isUp) 1 .. line step 2 else line - 2 downTo 1 step 2

    for (i in range) {
        val output = StringBuilder()

        for (j in 0..< line) {
            if (j >= mid && j < mid + i) {
                output.append('*')
                if (j == mid + i - 1) {
                    break
                }
            } else {
                output.append(' ')
            }
        }
        mid = if (isUp) mid - 1 else mid + 1
        println(output.toString())
    }
}