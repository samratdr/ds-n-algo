package kotl

import kotlin.math.roundToInt
import kotlin.random.Random

fun swap(
        arr: IntArray,
        i: Int,
        j: Int
) {
    arr[i] = arr[j].also { arr[j] = arr[i] }
}

fun printArr(arr: IntArray) {
    println(arr.joinToString(
            prefix="[",
            postfix="]"
    ))
}

fun randomNumArray(
        length: Int,
        maxVal: Int = 10
): IntArray {
    return Array(length) { (maxVal * Math.random()).roundToInt() }.toIntArray()
}

fun shuffleArray(arr: IntArray) {
    val rg = Random(arr.size)

    for (i in 0 until arr.size) {
        val randomPos = rg.nextInt(arr.size)
        swap(arr, i, randomPos)
    }
}
