List<String> results = new ArrayList<>();

        int[] weights = new int[s.length()];
        weights[0] = s.charAt(0) - 'a' + 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                weights[i] = weights[i - 1] + (s.charAt(i) - 'a' + 1);
            } else {
                weights[i] = (s.charAt(i) - 'a' + 1);
            }
        }

        for (int query : queries) {
            boolean found = false;
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] == query) {
                    found = true;
                    break;
                }
            }

            if (found) {
                results.add("Yes");
            } else {
                results.add("No");
            }
        }

        return results;

// big o = (n + m) 
// The solution needs to traverse the input string once to create the array of weights. This takes O(n) time.
// The solution then needs to traverse each query to check if the query weight is in the array of weights. This takes O(m) time.
// Therefore, the big O of the solution is O(n + m).
