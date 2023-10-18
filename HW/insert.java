public static void insertionSort1Recursive(int n, List<Integer> arr) {
    // If the array is empty or has only one element, return.
    if (n <= 1) {
        return;
    }

    // Recursively sort the first n - 1 elements of the array.
    insertionSort1Recursive(n - 1, arr);

    // Insert the last element of the array into its correct position.
    int pos = arr.get(n - 1);
    int j = n - 2;

    while (j >= 0 && arr.get(j) > pos) {
        arr.set(j + 1, arr.get(j));
        j--;
    }

    arr.set(j + 1, pos);
}
