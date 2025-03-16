package Collection_HashMap;

import java.util.HashMap;

public class HashMapComparison {
    public static void main(String[] args) {
        // Creating two HashMaps
        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        HashMap<Integer, String> map3 = new HashMap<>();

        // Adding values
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Cherry");

        map2.put(1, "Apple");
        map2.put(2, "Banana");
        map2.put(3, "Cherry");

        map3.put(1, "Green Apple");
        map3.put(2, "Banana");
        map2.put(3, "Cherry");
        
        // Comparing using equals()
        System.out.println("Are both HashMaps equal? " + map1.equals(map2)); // Output: true
        System.out.println("Are both HashMaps equal? " + map1.equals(map3)); // Output: false
    }
}
