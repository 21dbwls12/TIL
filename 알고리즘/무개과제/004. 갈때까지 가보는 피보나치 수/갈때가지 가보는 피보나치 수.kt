fun fibonacciByRecursion(n: Int, current: Int, nList: MutableList<Long>): Long {
    // 피드백
    // kotlin에서 권장하는 방법이 아님
    // 같은 이름의 변수가 2개가 되어서 가독성 이슈가 있음
    var current = current
    val nList = nList

    if (current <= n) {
        if (current <= 2) {
            nList.add((current - 1).toLong())
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
        // 피드백
        // 어차피 한줄이라 return에 위의 줄을 넣는 게 더 나을 것 같다고 하심.
        // 그러면 변수 선언없이 동작이 가능하기 때문.
        // return fibonacciByRecursion(n, current+1, nList)
        // 동일한 이유로 nList 변수도 불필요해보인다고 하심.
        // recursion, nList 전달없이 구성하는 방법도 고민해보기!
        return fibonacciByRecursion(n, current, nList)
    }
}

fun fibonacciByIteration(n: Int): Long {
    var current = 1
    val nList = mutableListOf<Long>()

    while (current <= n) {
        if (current <= 2) {
            nList.add((current - 1).toLong())
        } else {
            val fn = nList[current - 2] + nList[current - 3]
            nList.add(fn)
        }
        if (current == n) {
            break
        } else {
            current++
        }
    }
    return nList[n - 1]
}
