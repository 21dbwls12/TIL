fun main(args: Array<String>) {
    val s1 = readln()!!.toCharArray()
    
    for (a in s1) {
        println(a)
    }
}

"""
처음에 
val s1 = readln().split("")
이렇게 했는데 이거는 맨앞과 맨뒤에 공백을 추가하기 때문에 결과값이 다르다고 함
"""
