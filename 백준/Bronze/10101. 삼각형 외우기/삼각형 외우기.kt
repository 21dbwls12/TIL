fun main() {
    val x = readln().toInt()
    val y = readln().toInt()
    val z = readln().toInt()
    val all = x + y + z
    var answer = ""

    answer = if (all != 180) {
        "Error"
    } else {
        if (x == y && y == z) {
            "Equilateral"
        } else if (x == y || y == z || x == z) {
            "Isosceles"
        } else {
            "Scalene"
        }
    }
    print(answer)
}