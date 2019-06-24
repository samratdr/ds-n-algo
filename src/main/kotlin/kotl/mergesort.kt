package kotl

import kotlin.math.floor

fun mergeSort(
        arr: IntArray,
        left: Int = 0,
        right: Int = arr.size - 1
) {
    val length = right - left + 1

    if (length < 2) return

    val mid = floor((left + right) / 2.0).toInt()
    mergeSort(arr, left, mid)
    mergeSort(arr, mid + 1, right)

    merge(arr, left, mid, right)
}

private fun merge(
          arr: IntArray,
         left: Int,
          mid: Int,
        right: Int
) {
    val leftArray = arr.copyOfRange(left, mid + 1)
    val rightArray = arr.copyOfRange(mid + 1, right + 1)

    var i = 0
    var j = 0

    for (k in left..right) {
        if (i < leftArray.size && (j >= rightArray.size || leftArray[i] <= rightArray[j]))
            arr[k] = leftArray[i++]
        else
            arr[k] = rightArray[j++]
    }
}
