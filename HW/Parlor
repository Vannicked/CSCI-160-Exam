if (arr.size() == 0) {
        return Collections.emptyList();
    }

    int cost = arr.get(0);
    int restMoney = m - cost;

    if (arr.contains(restMoney) && arr.indexOf(restMoney) != 0) {
        List<Integer> indices = new ArrayList<>();
        indices.add(1);
        indices.add(arr.indexOf(restMoney) + 1);
        return indices;
    }

    return icecreamParlor(m, arr.subList(1, arr.size()));

// Big O runtime is n^2 as the worst case is going through the entire n length.
