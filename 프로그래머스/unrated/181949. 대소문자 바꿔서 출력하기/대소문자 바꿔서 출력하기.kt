fun main(args: Array<String>) {
    val s1 = readLine()!!
    var result = ""
    
    for (a in s1) {
        if(a in 'A'..'Z' || a in 'a'..'z') {
            when(a.isUpperCase()) {
                true -> result += a.lowercaseChar()
                false -> result += a.uppercaseChar()
            }
        } else {
            continue
        }
    }
    print(result)
}