import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val list = mutableListOf<Int>()

    repeat(5) {
        val input = sc.nextInt()
        list.add(input)
    }
    list.sort()
    println(list.sum() / 5)
    print(list[2])
}