// 방법 1
import kotlin.math.round

fun main() {
    val (listA, listB) = readln().split(" ").map { it.toDouble() }.chunked(3)
    val equationA = listA.toMutableList()
    val equationB = listB.toMutableList()
    val ax = equationA[0]
    val bx = equationB[0]
    var degreeY = 0.0
    var temp = 0.0
    var x = 0.0
    var y = 0.0

    if (equationA.contains(0.0) || equationB.contains(0.0)) {
        when {
            equationA[0] == 0.0 -> {
                y = equation0(equationA[1], equationA[2])
                x = equation1(listB, y)
            }
            equationA[1] == 0.0 -> {
                x = equation0(equationA[0], equationA[2])
                y = equation1(listB, x)
            }
            equationB[0] == 0.0 -> {
                y = equation0(equationB[1], equationB[2])
                x = equation1(listA, y)
            }
            equationB[1] == 0.0 -> {
                x = equation0(equationB[0], equationB[2])
                y = equation1(listA, x)
            }
        }
    } else {
        equationA.forEachIndexed { i, _ ->
            equationA[i] *= bx
        }
        equationB.forEachIndexed { i, _ ->
            equationB[i] *= ax
        }
        degreeY = equationA[1] - equationB[1]
        temp = equationA[2] - equationB[2]
        y = if (degreeY == 0.0 || temp == 0.0) {
            0.0
        } else {
            temp / degreeY
        }
        x = equation1(listA, y)
    }
    x = round(x)
    y = round(y)
    print("${x.toInt()} ${y.toInt()}")
}

fun equation0(degreeY: Double, number: Double): Double {
    return if (number == 0.0) {
        0.0
    } else {
        number / degreeY
    }
}

fun equation1(list: List<Double>, n: Double): Double {
    return if (list[2] - (list[1] * n) == 0.0 || list[0] == 0.0) {
        0.0
    } else {
        (list[2] - (list[1] * n)) / list[0]
    }
}

// 방법 2 (직접 대입 하는 방법)
// 메모리: 22004 KB, 시간: 220 ms
fun main() {
    val (equationA, equationB) = readln().split(" ").map { it.toDouble() }.chunked(3)
    var x = 0
    var y = 0

    for (tempX in -999 .. 999) {
        for (tempY in -999 .. 999) {
            if ((equationA[0] * tempX) + (equationA[1] * tempY) == equationA[2] && (equationB[0] * tempX) + (equationB[1] * tempY) == equationB[2]){
                x = tempX
                y = tempY
                break
            }
        }
    }
    print("$x $y")
}
