package Collection_HashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashtableOperations {
	
	public static void main(String[] args) {
        // 1️ Creating a Hashtable (Does NOT allow null keys/values)
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // 2️ Adding Elements
        hashtable.put(101, "Alice");
        hashtable.put(102, "Bob");
        hashtable.put(103, "Charlie");
        hashtable.putIfAbsent(104, "David"); // Adds only if key 104 is absent

        System.out.println("Hashtable: " + hashtable);

        // 3️ Retrieving Elements
        System.out.println("Value for key 102: " + hashtable.get(102));
        System.out.println("Value for key 200 (or default): " + hashtable.getOrDefault(200, "Not Found"));

        // 4️ Checking Existence
        System.out.println("Contains key 101? " + hashtable.containsKey(101));
        System.out.println("Contains value 'Eve'? " + hashtable.containsValue("Eve"));

        // 5️ Updating Elements
        hashtable.replace(103, "Charlie", "Catherine"); // Replaces only if value matches
        hashtable.replace(104, "David");

        // 6️ Removing Elements
        hashtable.remove(101); // Removes key 101
        hashtable.remove(102, "Bob"); // Removes only if key-value pair matches

        // 7️ Iterating Over Entries
        System.out.println("\nIterating using entrySet:");
        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Iterating using Enumeration
        System.out.println("\nIterating using Enumeration:");
        Enumeration<Integer> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer key = keys.nextElement();
            System.out.println(key + " -> " + hashtable.get(key));
        }

        // 8️ Getting the Size
        System.out.println("\nSize of Hashtable: " + hashtable.size());

        // 9️ Checking If Empty
        System.out.println("Is Hashtable empty? " + hashtable.isEmpty());

        // 10 Clearing the Hashtable
        hashtable.clear();
        System.out.println("Hashtable after clear(): " + hashtable);
    }
}
