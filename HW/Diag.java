int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            leftDiagonalSum += arr.get(i).get(i);
            rightDiagonalSum += arr.get(i).get(arr.size() - 1 - i);
        }

        return Math.abs(leftDiagonalSum - rightDiagonalSum);

// big o runtime = n
