package kotl

fun selectionSort(arr: IntArray) {
    for (i in 0 until arr.size - 2) {
        var min = arr[i]

        var localMin: Int = arr[i + 1]
        var minIndx: Int = i + 1
        for (j in i + 2 until arr.size) {
            if (localMin > arr[j]) {
                localMin = arr[j]
                minIndx = j
            }
        }

        if (min > localMin) {
            swap(arr, i, minIndx)
        }
    }
    printArr(arr)
}
