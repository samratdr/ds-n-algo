package kotl

fun bubbleSort(arr: IntArray) {
    for (i in 0 until arr.size) {
        var swapped = false
        for (j in 0 until arr.size-1) {
            if (arr[j] > arr[j+1]) {
                swap(arr, j, j+1)
                swapped = true
            }
        }

        if (!swapped) {
            println("Loops: $i")
            break
        }
    }
    printArr(arr)
}
