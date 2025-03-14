package Collection_LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetOperations {
    public static void main(String[] args) {
        // 1️ Creating a LinkedHashSet
        LinkedHashSet<String> names = new LinkedHashSet<>();

        // 2 Adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Alice"); // Duplicate, will not be added
        System.out.println("LinkedHashSet after additions: " + names);

        // 3️ Checking if an element exists
        System.out.println("Contains 'Charlie'? " + names.contains("Charlie"));
        System.out.println("Contains 'Eve'? " + names.contains("Eve"));

        // 4️ Removing an element
        names.remove("Bob");
        System.out.println("After removing 'Bob': " + names);

        // 5️ Get size of LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + names.size());

        // 6️ Iterating over elements
        System.out.println("Iterating using for-each:");
        for (String name : names) {
            System.out.println(name);
        }

        // Using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 7️ Convert LinkedHashSet to Array
        Object[] nameArray = names.toArray();
        System.out.println("Converted to Array:");
        for (Object obj : nameArray) {
            System.out.println(obj);
        }

        // 8️ Check if empty
        System.out.println("Is LinkedHashSet empty? " + names.isEmpty());

        // 9️ Clearing all elements
        names.clear();
        System.out.println("After clear(): " + names);
        System.out.println("Is LinkedHashSet empty now? " + names.isEmpty());
    }
}

