fun main() {
    val input = readln().split(" ")
    val list = readln().split(" ")
    var s = input[1].toInt()

    for (num in list) {
        if (num.toInt() < s) {
            print("$num ")
        }
    }
}