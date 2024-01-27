fun main() {
    // single() == 문자열을 Char 타입으로 변환
    // toInt() == 정수로 변환
    // code == 문자의 아스키코드 반환
    // readln().single().toInt()도 가능하지만 code 권장
    val c = readln().single().code

    print(c)
}