fun quickSort(arr: IntArray, left: Int, right: Int) {
    if (left >= right || isSorted(arr, left, right)) {
        return
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
