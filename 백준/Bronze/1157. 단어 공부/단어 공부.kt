fun main() {
    val input = readln().uppercase()
//    val map = input.groupingBy { it }.eachCount()
//    val max = map.maxBy { it.value }
//    var output = max.key
//
//    if (map.count { it.value == max.value } > 1) {
//        output = '?'
//    }
    val map = ('A' .. 'Z').associateWith { 0 }.toMutableMap()
    var count = 0
    var output = ' '

    for (c in input) {
        map[c] = map[c]!! + 1
    }
    for ((c, n) in map) {
        if (n > count ) {
            count = n
            output = c
        } else if (n == count) {
            output = '?'
        }
    }
    print(output)
}