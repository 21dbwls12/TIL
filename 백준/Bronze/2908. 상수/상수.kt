fun main() {
    val list = readln().split(" ").map { it.reversed().toInt() }
    print(list.max())

//    val (a, b) = readln().split(" ")
//    val a1 = "${a[2]}${a[1]}${a[0]}".toInt()
//    val b1 = "${b[2]}${b[1]}${b[0]}".toInt()
//
//    if (a1 > b1) {
//        print(a1)
//    } else {
//        print(b1)
//    }
}