package Collection_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapOperations {
	 public static void main(String[] args) {
	        // 1. Creating a LinkedHashMap (Maintains Insertion Order)
	        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

	        // 2. Adding Elements
	        linkedHashMap.put(1, "Apple");
	        linkedHashMap.put(2, "Banana");
	        linkedHashMap.put(3, "Cherry");
	        linkedHashMap.putIfAbsent(4, "Date");

	        // 3. Retrieving Elements
	        System.out.println("Value for key 2: " + linkedHashMap.get(2));
	        System.out.println("Value for key 5 (or default): " + linkedHashMap.getOrDefault(5, "Not Found"));

	        // 4. Checking Existence
	        System.out.println("Contains key 3? " + linkedHashMap.containsKey(3));
	        System.out.println("Contains value 'Mango'? " + linkedHashMap.containsValue("Mango"));

	        // 5. Updating Elements
	        linkedHashMap.replace(2, "Blueberry");
	        linkedHashMap.replace(3, "Cherry", "Coconut");

	        // 6. Removing Elements
	        linkedHashMap.remove(1);
	        linkedHashMap.remove(4, "Date"); // Removes only if key-value pair matches

	        // 7. Iterating Over Entries
	        System.out.println("\nIterating using forEach:");
	        linkedHashMap.forEach((key, value) -> System.out.println(key + " -> " + value));

	        System.out.println("\nIterating using entrySet:");
	        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }
	        
	        // 8. Getting Size
	        System.out.println("\nSize of LinkedHashMap: " + linkedHashMap.size());

	        // 9. Checking If Empty
	        System.out.println("Is LinkedHashMap empty? " + linkedHashMap.isEmpty());

	        // 10. Cloning a LinkedHashMap
	        LinkedHashMap<Integer, String> clonedMap = (LinkedHashMap<Integer, String>) linkedHashMap.clone();
	        System.out.println("Cloned LinkedHashMap: " + clonedMap);

	        // 11. Using compute(), computeIfAbsent(), computeIfPresent()
	        linkedHashMap.compute(2, (key, value) -> value + " Updated");
	        linkedHashMap.computeIfAbsent(5, key -> "Elderberry");
	        linkedHashMap.computeIfPresent(3, (key, value) -> value + " Modified");

	        System.out.println("\nLinkedHashMap after compute operations: " + linkedHashMap);

	        // 12. Replacing All Elements
	        linkedHashMap.replaceAll((key, value) -> value.toUpperCase());
	        System.out.println("LinkedHashMap after replaceAll: " + linkedHashMap);

	        // 13. Clearing All Elements
	        linkedHashMap.clear();
	        System.out.println("LinkedHashMap cleared. Size: " + linkedHashMap.size());
	    }
}
