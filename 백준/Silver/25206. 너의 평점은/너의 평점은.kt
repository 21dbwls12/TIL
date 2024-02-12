fun main() {
    val grade = mapOf(
        "A+" to 4.5,
        "A0" to 4.0,
        "B+" to 3.5,
        "B0" to 3.0,
        "C+" to 2.5,
        "C0" to 2.0,
        "D+" to 1.5,
        "D0" to 1.0,
        "F" to 0.0,
    )
    var totalSum = 0.0
    var scoreSum = 0.0

    for (i in 1..20) {
        val input = readln().split(" ")
        val score = input[1].toDouble()
        val gpa = input[2]

        if (gpa != "P") {
            totalSum += grade[gpa]?.times(score) ?: continue
            scoreSum += score
        }
    }
    print(totalSum / scoreSum)
}