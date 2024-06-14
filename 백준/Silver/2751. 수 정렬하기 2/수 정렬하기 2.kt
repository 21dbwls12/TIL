import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    var list = mutableListOf<Int>()

    repeat(n) {
        val input = br.readLine().toInt()
        list.add(input)
    }
    mergeSortDivide(list).forEach { bw.write("$it\n") }
    bw.flush()
    bw.close()
}

fun mergeSortDivide(list: MutableList<Int>): MutableList<Int> {
    val middle = list.size / 2
    val left = mutableListOf<Int>()
    val right = mutableListOf<Int>()

    if (list.size <= 1) {
        return list
    }
    for (i in list.indices) {
        if (i < middle) {
            left.add(list[i])
        } else {
            right.add(list[i])
        }
    }
    return (mergeSort(mergeSortDivide(left), mergeSortDivide(right)))
}

fun mergeSort(left: MutableList<Int>, right: MutableList<Int>): MutableList<Int> {
    var l = 0
    var r = 0
    val sortedList = mutableListOf<Int>()

    while (l < left.size && r < right.size) {
        if (left[l] < right[r]) {
            sortedList.add(left[l])
            l++
        } else {
            sortedList.add(right[r])
            r++
        }
    }
    if (l < left.size) {
        while (l < left.size) {
            sortedList.add(left[l])
            l++
        }
    } else {
        while (r < right.size) {
            sortedList.add(right[r])
            r++
        }
    }
    return sortedList
}