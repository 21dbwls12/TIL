fun main() {
    val alphabetList = listOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    val input = readln()
    var count = 0
    var i = 0

    // list로 비교하면서 카운트
    while (i < input.length) {
        if (i < input.length - 1 && input.substring(i, i + 2) in alphabetList) {
            i ++
        } else if (i < input.length - 2 && input.substring(i, i + 3) in alphabetList) {
            i += 2
        }
        count++
        i++
    }

    // when문으로 구현, 문자 하나하나 비교하면서 카운트
//    while (i >= 0) {
//        if (i == 0) {
//            count++
//            break
//        } else {
//            val previous = input[i - 1]
//            when (input[i]) {
//                '=' -> if (previous == 'z' && input[i - 2] == 'd') {
//                    i -= 2
//                } else if (previous == 'c' || previous == 's' || previous == 'z') {
//                    i--
//                }
//
//                '-' -> if (previous == 'c' || previous == 'd') {
//                    i--
//                }
//
//                'j' -> if (previous == 'l' || previous == 'n') {
//                    i--
//                }
//            }
//            count++
//            i--
//        }
//    }
    print(count)
}
