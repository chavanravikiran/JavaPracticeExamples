package Collection_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapOperations {
	public static void main(String[] args) {
        // 1. Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2. Adding Elements
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.putIfAbsent(3, "Charlie"); // Adds only if key is absent

        // 3. Retrieving Elements
        System.out.println("Get key 1: " + map.get(1));
        System.out.println("Get key 5 (or default): " + map.getOrDefault(5, "Default Name"));

        // 4. Checking for Existence
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value 'Bob'? " + map.containsValue("Bob"));

        // 5. Updating Values
        map.replace(2, "Bobby");
        System.out.println("Get key 2: " + map.get(2));
        map.replace(2, "Bobby", "Bob Updated");
        System.out.println("Get key 2: " + map.get(2));
        
        // 6. Removing Elements
        map.remove(1);
        map.remove(2, "Bob Updated");

        // 7. Iterating Over HashMap
        System.out.println("\nIterating using forEach:");
        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        System.out.println("\nIterating using entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 8. Getting Size of HashMap
        System.out.println("Size of map: " + map.size());

        // 9. Checking if HashMap is Empty
        System.out.println("Is map empty? " + map.isEmpty());

        // 10. Clearing HashMap
        map.clear();
        System.out.println("Map cleared. Size: " + map.size());

        // 11. Cloning HashMap
        map.put(4, "David");
        map.put(5, "Eve");
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) map.clone();
        System.out.println("Cloned Map: " + clonedMap);

        // 12. Merging Values //concatinate
        map.merge(4, " Smith", (oldValue, newValue) -> oldValue + newValue);
        System.out.println("After merge: " + map.get(4));

        // 13. Using compute, computeIfAbsent, computeIfPresent
        map.compute(5, (key, value) -> value + " Updated");
        map.computeIfAbsent(6, key -> "New Value");
        map.computeIfPresent(4, (key, value) -> value + " Modified");

        System.out.println("Map after compute operations: " + map);

        // 14. Replacing All Elements
        map.replaceAll((key, value) -> value.toUpperCase());
        System.out.println("Map after replaceAll: " + map);
    }
}
