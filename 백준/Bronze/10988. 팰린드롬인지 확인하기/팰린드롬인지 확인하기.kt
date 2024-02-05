fun main() {
    val input = readln()
    var output = 0

//    if (input == input.reversed()) {
//        output = 1
//    }

    var start = ""
    var end = ""
    val mid = input.length / 2

    for (i in 0 .. mid) {
        if (i != mid) {
            start += input[i]
            end += input[input.length - i - 1]
        } else {
            break
        }
    }
    if (start == end) {
        output = 1
    }
    print(output)
}