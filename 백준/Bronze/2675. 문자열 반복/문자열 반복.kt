fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (r, s) = readln().split(" ")
        val output = s.map { it.toString().repeat(r.toInt()) }.joinToString("")

        println(output)

//        s.forEach { print(it.toString().repeat(r.toInt())) }
//
//        println()

//        for (c in s) {
//            repeat(r.toInt()) {
//                print(c)
//            }
//        }
//        println()
//        StringBuilder 써도 됨
    }
}