package kotl

fun insertionSort(arr: IntArray) {
    val nElems = arr.size

    for (i in 1 until nElems) {
        val key = arr[i]

        var j = i - 1
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j]
            j -= 1
        }
        arr[j + 1] = key
    }

    printArr(arr)
}
