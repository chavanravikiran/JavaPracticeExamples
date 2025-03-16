package Collection_TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapOperations {
    public static void main(String[] args) {
        // 1️ Creating a TreeMap (Maintains Sorted Order by Key)
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // 2️ Adding Elements
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(4, "Cherry");
        treeMap.put(2, "Date");
        treeMap.putIfAbsent(5, "Elderberry");

        System.out.println("TreeMap: " + treeMap);

        // 3️ Retrieving Elements
        System.out.println("Value for key 2: " + treeMap.get(2));
        System.out.println("Value for key 6 (or default): " + treeMap.getOrDefault(6, "Not Found"));

        // 4️ Checking Existence
        System.out.println("Contains key 3? " + treeMap.containsKey(3));
        System.out.println("Contains value 'Mango'? " + treeMap.containsValue("Mango"));

        // 5️⃣ Updating Elements
        treeMap.replace(2, "Blueberry");
        treeMap.replace(3, "Apple", "Coconut");//key , oldValue , newValue

        // 6️ Removing Elements
        treeMap.remove(1);
        treeMap.remove(5, "Elderberry"); // Removes only if key-value pair matches

        // 7️ Iterating Over Entries
        System.out.println("\nIterating using entrySet:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 8️ Retrieving First & Last Entries
        System.out.println("\nFirst Entry: " + treeMap.firstEntry());
        System.out.println("Last Entry: " + treeMap.lastEntry());

        // 9️ Retrieving Floor, Ceiling, Lower, and Higher Entries
        System.out.println("Floor Entry (<= 3): " + treeMap.floorEntry(3));//self or lower
        System.out.println("Ceiling Entry (>= 3): " + treeMap.ceilingEntry(3));//self or higher
        System.out.println("Lower Entry (< 3): " + treeMap.lowerEntry(3));//lower
        System.out.println("Higher Entry (> 3): " + treeMap.higherEntry(3));//higher

        // 10 Navigating using subMap, headMap, tailMap
        System.out.println("SubMap (2 to 4): " + treeMap.subMap(2, 5)); // Exclusive of 5
        System.out.println("HeadMap (< 3): " + treeMap.headMap(3)); // All keys < 3
        System.out.println("TailMap (>= 3): " + treeMap.tailMap(3)); // All keys >= 3

        // 1️1 Reverse Order Iteration
        NavigableMap<Integer, String> reversedMap = treeMap.descendingMap();
        System.out.println("\nTreeMap in Reverse Order:");
        for (Map.Entry<Integer, String> entry : reversedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 12 Using compute(), computeIfAbsent(), computeIfPresent()
        treeMap.compute(2, (key, value) -> value + " Updated");
        treeMap.computeIfAbsent(6, key -> "Fig");
        treeMap.computeIfPresent(3, (key, value) -> value + " Modified");

        System.out.println("\nTreeMap after compute operations: " + treeMap);
    }
}
