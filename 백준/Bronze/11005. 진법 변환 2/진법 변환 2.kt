fun main() {
    val (n, b) = readln().split(" ")
    println(n.toLong().toString(b.toInt()).uppercase())
}