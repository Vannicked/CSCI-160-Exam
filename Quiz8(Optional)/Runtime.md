STAIRCASE:
The solution has a big O runtime of O(n^2), where n is the input integer.
 This is because the solution needs to iterate over the input integer n twice, once for each row in the staircase.

ALTERNATING CHARACTERS:
Best-case scenario:
 If all characters in the string are different, the function only needs to iterate through the string once. This leads to a best-case time complexity of O(n).

Average-case scenario:
 On average, the function might need to iterate through a portion of the string in each recursive call. This leads to an average-case time complexity closer to O(n^2) than O(n).
