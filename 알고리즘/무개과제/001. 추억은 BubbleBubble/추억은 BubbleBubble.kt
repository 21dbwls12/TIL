// 오름차순 정렬
fun bubbleSort(arr: IntArray): IntArray {
    for (r in arr.size - 1 downTo 1) {
        var count = 0

        for (i in 0 ..< r) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1].also { arr[i + 1] = arr[i] }
                count++
            }
            println(arr.toList())
        }
        if(count == 0) {
            break
        }
    }
    return arr
}
