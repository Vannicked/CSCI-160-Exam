public static int recursiveAlternatingCharacters(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        if (s.charAt(0) == s.charAt(1)) {
            return 1 + recursiveAlternatingCharacters(s.substring(1));
        }

        return recursiveAlternatingCharacters(s.substring(1));
    }

// Big O is n as the string is entered and checked only once.
