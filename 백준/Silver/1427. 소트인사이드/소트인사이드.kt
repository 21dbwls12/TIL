import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLine()
    val list = mutableListOf<Int>()

    for (num in n) {
        list.add(num.toString().toInt())
    }
    list.sortDescending()
    list.forEach { print(it) }
}