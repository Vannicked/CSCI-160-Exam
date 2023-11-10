import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'runningTime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int runningTime(List<Integer> arr) {
    // If the array is empty or has only one element, return 0.
    if (arr.size() <= 1) {
        return 0;
    }

    // Get the last element of the array.
    int value = arr.get(arr.size() - 1);

    // Recursively sort the first n - 1 elements of the array.
    int shifts = runningTime(arr.subList(0, arr.size() - 1));

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

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.runningTime(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
