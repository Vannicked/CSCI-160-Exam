public static List<Integer> quickSortRecursive(List<Integer> arr) {
    // If the array is empty or has only one element, return the array.
    if (arr.size() <= 1) {
        return arr;
    }

    // Choose the pivot element.
    int pivot = arr.get(0);

    // Partition the array around the pivot element.
    List<Integer> left = new ArrayList<>();
    List<Integer> right = new ArrayList<>();

    for (int value : arr) {
        if (value < pivot) {
            left.add(value);
        } else if (value > pivot) {
            right.add(value);
        }
    }

    // Recursively sort the left and right subarrays.
    List<Integer> sortedLeft = quickSortRecursive(left);
    List<Integer> sortedRight = quickSortRecursive(right);

    // Return the sorted array.
    List<Integer> sortedArray = new ArrayList<>();
    sortedArray.addAll(sortedLeft);
    sortedArray.add(pivot);
    sortedArray.addAll(sortedRight);

    return sortedArray;
}
