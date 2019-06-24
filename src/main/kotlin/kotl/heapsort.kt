package kotl

fun heapSort(arr: IntArray) {
    val nElems = arr.size

    for (i in ((nElems ushr 1) - 1) downTo 0)
        maxHeapify(arr, i, nElems - 1)

    for (i in (nElems - 1) downTo 0) {
        swap(arr, 0, i)
        maxHeapify(arr, 0, i - 1)
    }
}

private fun maxHeapify(arr: IntArray, iterationRoot: Int, nElems: Int) {
    var leftIndex = (iterationRoot shl 1) + 1
    if (leftIndex > nElems) return

    var rightIndex = (iterationRoot + 1) shl 1

    var maxIndex = if (rightIndex > nElems)
                            leftIndex
                        else {
                            if (arr[leftIndex] > arr[rightIndex])
                                leftIndex
                            else
                                rightIndex
                        }

    if (arr[iterationRoot] > arr[maxIndex]) return

    swap(arr, iterationRoot, maxIndex)
    maxHeapify(arr, maxIndex, nElems)
}
