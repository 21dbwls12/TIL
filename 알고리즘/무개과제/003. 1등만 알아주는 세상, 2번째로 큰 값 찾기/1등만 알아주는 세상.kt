// 메모리: 3723 KB, 시간: 3292 ms
fun sorted():Int {
    val input = readln().split(",").map { it.toInt() }.sorted()

    return (input[input.size - 2])
}

// 메모리: 4268 KB, 시간: 2783 ms
fun sortedDescending(): Int {
    val input = readln().split(",").map { it.toInt() }.sortedDescending()

    return(input[1])
}

// 메모리: 4174 KB, 시간: 2831 ms
fun sortedBy(): Int {
    val input = readln().split(",").map { it.toInt() }.sortedBy { it }

    return(input[input.size - 2])
}

// 메모리: 4174 KB, 시간: 1119 ms
fun sortedByDescending(): Int {
    val input = readln().split(",").map { it.toInt() }.sortedByDescending { it }

    return(input[1])
}

// 메모리: 2192 KB, 시간: 14951 ms
fun findingSecond(): Int? {
    val input = readln().split(",").map { it.toInt() }
    var first: Int? = null
    var second: Int? = null

    for (n in input) {
        when {
            first == null || first < n -> first = n
            // 메모리: 2192 KB, 시간: 2202 ms
            second == null || (n < first && n > second) -> second = n
            // 메모리: 2192 KB, 시간: 14951 ms
            // 범위로 하면 훨씬 오래걸림!!
            second == null || (n in (second + 1)..<first) -> second = n
        }
    }
    return second
}

// 메모리: 2192 KB, 시간: 762 ms
fun sortWithQuickSort(): Int {
    val input = readln().split(",").map { it.toInt() }
    val sortedArray = quickSort(input.toIntArray(), 0, input.size - 1)

    return sortedArray[sortedArray.size - 2]
}

fun quickSort(arr: IntArray, left: Int, right: Int): IntArray {
    if (left >= right || isSorted(arr, left, right)) {
        return arr
    }

    val middle = (left + right) / 2
    val pivot = arr[middle]
    var l = left
    var r = right

    while (l <= r) {
        while (arr[l] < pivot) {
            l++
        }
        while (arr[r] > pivot) {
            r--
        }
        if (l <= r) {
            arr[l] = arr[r].also { arr[r] = arr[l] }
            l++
            r--
        }
    }
    if (left < r && !isSorted(arr, left, r)) {
        quickSort(arr, left, r)
    }
    if (right > l && !isSorted(arr, l, right)) {
        quickSort(arr, l, right)
    }
    return arr
}

// 중간에 배열이 다 정렬되면 정렬 그만하기 위한 조건 검사 함수
fun isSorted(arr: IntArray, left: Int, right: Int): Boolean {
    for (i in left..<right) {
        if (arr[i] > arr [i + 1]) {
            return false
        }
    }
    return true
}
