public static List<Integer> icecreamParlor(int m, List<Integer> arr) {      
  //Perform find the ice cream Palor
    for(int index = 0; index < arr.size(); index++) { // for each index in the array size
        int cost = arr.get(index); // take the cost of that index
        int restMoney = m - cost; // remaining amount of money from cost
        for(int i = 0; i < arr.size(); i++) { // same con. as first
            if(i != index && arr.get(i) < restMoney) { // as long as the index != prev index and equals the remaining money
              for(int i2 = 0; i < arr.size(); i++) {
              if(i2 != index && i2 != i && arr.get(i2) <= restMoney){ // if the new index isn't the previous 2 indexes and current index is less than or equal to restMoney
                List<Integer> list = new ArrayList<>(); // create new list
                list.add(index + 1); // add first index (flavor)
                list.add(i + 1); // add second index (flavor)
                list.add(i2 + 1); // add third flavor
                return list;
              }
        }
            } 
    }
    
    return Collections.emptyList();
    }
}
