public static void insertionSort2Recursive(int n, List<Integer> arr) {
    // If the array is empty or has only one element, return.
    if (n <= 1) {
        return;
    }

    // Recursively sort the first n - 1 elements of the array.
    insertionSort2Recursive(n - 1, arr);

    // Insert the last element of the array into its correct position.
    int value = arr.get(n - 1);
    int position = n - 2;

    while (position >= 0 && arr.get(position) > value) {
        arr.set(position + 1, arr.get(position));
        position--;
    }

    arr.set(position + 1, value);

    // Print the sorted array.
    print(arr);
}
