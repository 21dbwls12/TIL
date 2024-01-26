fun main() {
    val list = mutableListOf<Int>()

    repeat(10) {
        val n = readln().toInt()
        list.add(n)
    }
    print(list.groupingBy { it % 42 }.eachCount().size)
}