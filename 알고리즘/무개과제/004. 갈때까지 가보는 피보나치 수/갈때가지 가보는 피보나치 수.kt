fun fibonacci(n: Int, current: Int, nList: MutableList<Int>): Int {
    val n = n
    var current = current
    val nList = nList

    if (current <= n) {
        if (current <= 2) {
            nList.add(current - 1)
        } else {
            val fn = nList[current - 2] + nList[current - 3]
            nList.add(fn)
        }
    }
    if (current == n) {
        return nList[n - 1]
    } else {
        // number++가 작동하지 않음
        // ++연산자는 스코프 내에서만 유효하며 임시로 1을 증가시킴.
        // 스코프를 벗어나면 임시로 할당되었던 값은 사라지고 원래의 값으로 돌아감.
        current += 1
        return fibonacci(n, current, nList)
    }
}
