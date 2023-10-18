public static int runningTimeRecursive(List<Integer> arr) {
    // If the array is empty or has only one element, return 0.
    if (arr.size() <= 1) {
        return 0;
    }

    // Get the last element of the array.
    int value = arr.get(arr.size() - 1);

    // Recursively sort the first n - 1 elements of the array.
    int shifts = runningTimeRecursive(arr.subList(0, arr.size() - 1));

    // Insert the last element of the array into its correct position.
    int pos = arr.size() - 2;
    while (pos >= 0 && value < arr.get(pos)) {
        arr.set(pos + 1, arr.get(pos));
        pos--;
        shifts++;
    }
    arr.set(pos + 1, value);

    // Return the number of shifts.
    return shifts;
}
