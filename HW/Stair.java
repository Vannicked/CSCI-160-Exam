for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(j >= n - i - 1 ? "#" : " ");
        }
        System.out.println();
    }

// This solution has a big O runtime of O(n^2), where n is the input integer. This is because the solution needs to iterate over the input integer n twice, once for each row in the staircase.
