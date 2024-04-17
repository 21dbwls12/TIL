fun main() {
    val (x, y, w, h) = readln().split(" ").map { it.toInt() }
    val list = listOf(x, y, w - x, h - y)
    
    println(list.min())
}