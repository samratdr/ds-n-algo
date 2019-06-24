package kotl

fun quicksort(arr: IntArray,
              left: Int = 0,
              right: Int = arr.size - 1) {
    if (left < right) {
        val pivot = partition(arr, left , right)
        quicksort(arr, left, pivot - 1)
        quicksort(arr, pivot + 1, right)
    }
}

private fun partition(arr: IntArray, left: Int, right: Int): Int {
    var pivot = left - 1
    var leftp = left

    while (leftp < right) {
        if (arr[right] > arr[leftp]) {
            pivot++
            swap(arr, pivot, leftp)
        }
        leftp++
    }

    pivot++
    swap(arr, pivot, right)

    return pivot
}
