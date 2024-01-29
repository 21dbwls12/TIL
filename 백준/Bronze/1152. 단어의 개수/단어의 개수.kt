fun main() {
    val sentence = readln()

    if(sentence.isNotBlank()) {
        print(sentence.trim().split(" ").size)
    } else {
        print(0)
    }
}