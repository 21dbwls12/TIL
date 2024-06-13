import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val (n, k) = sc.nextLine().split(" ").map { it.toInt() }
    val list = sc.nextLine().split(" ").map { it.toInt() }.sortedDescending()

    println(list[k - 1])
}
