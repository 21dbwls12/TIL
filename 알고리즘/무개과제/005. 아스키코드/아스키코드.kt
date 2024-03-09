// 메모리: 901KB, 시간: 1ms
fun <T> ascii(c: T, type: String): Any {
    val stringC = c.toString()
    return when (type) {
        "int" -> {
            val intC = stringC.toInt()
            // 범위로 지정해주는 것과 속도와 메모리의 차이가 없음!
            // 처리할 숫자가 작아서 그런 듯?
            // 범위를 권장하는 것 같아 보임.. 노란 경고줄 생김
//            if (intC >= 0 && intC <= 127) {
            if (intC in 0..127) {
                "'${intC.toChar()}'"
            // return 하위에 if문이 들어가니깐 else가 없으면 오류가 뜸 
            } else {}
        }
        else -> stringC.single().code
    }
}

// 파라미터가 다르면 함수 이름이 같아도 오류가 없다!! 왠지 예전에 배웠던 것 같기도 하고... 기억이 가물가물...
// 위의 함수를 아래처럼 2부분으로 나누니깐 if문 오류도 없고 훨씬 간단하고 가독성도 좋은 거 같음
// 비교했을 때 속도는 더 빠른데 메모리는 더 큼
// 메모리: 1351KB, 시간: 0ms
fun ascii(c: Char): Int {
    return c.code
}

fun ascii(c:Int): Char {
    return c.toChar()
}
