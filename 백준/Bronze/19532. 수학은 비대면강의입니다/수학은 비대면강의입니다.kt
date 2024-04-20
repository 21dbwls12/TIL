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

// 오류 궁금증
// 이건 왜 안되는 거지?
// 0 2 6 1 1 7
// println(equationA.contains(0.0)) -> true -> else문으로 들어가야함.
// 근데 compile했을 때 if (!equationA.contains(0.0) || !equationB.contains(0.0))문 안으로 들어감..
// if (equationA.contains(0.0) || equationB.contains(0.0))으로 바꾸고 순서만 바꿨는데 제대로 작동이 됨..
// ????
// 이해함! 이해한 내용은 하단에
// 이해하고 나니... 스스로가 너무 한심하다.. 왜 저게 생각이 안난걸까...
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

    // or == 조건이 하나라도 true면 true 반환
    // 전자 조건은 false, 후자 조건이 true
    // 그래서 if 조건이 true가 되면서 만족함
    // 그래서 else문으로 들어가지 않고 if문으로 들어가서 실행됨!!
    if (!equationA.contains(0.0) || !equationB.contains(0.0)) {
        println(1)
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
    } else {
        println(2)
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
    }
    x = round(x)
    y = round(y)
    print("${x.toInt()} ${y.toInt()}")
}
