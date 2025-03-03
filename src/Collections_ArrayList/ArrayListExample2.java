package Collections_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample2 {
	public static void main(String args[]) {
		
		//1. Creating an ArrayList
		ArrayList<String> lists = new ArrayList<>();
		
		 // 2. Adding elements
		lists.add("Java");
		lists.add("Spring MVC");
		lists.add("Spring Boot");
		lists.add("Rubby");
		lists.add("C#");
		lists.add("PHP");
		lists.add(".Net");
		
		// 3. Adding an element at a specific index
        lists.add(1, "Python");
        System.out.println("After adding at index 1: " + lists);
		
        // 4. Adding another list
        ArrayList<String> newFruits = new ArrayList<>();
        
        newFruits.add("Elderberry");
        newFruits.add("Fig");
        lists.addAll(newFruits);
        System.out.println("After adding another list: " + lists);
        
        // 5. Accessing elements
        System.out.println("Element at index 2: " + lists.get(2));
        
        // 6. Updating an element
        lists.set(3, "Dragonfruit");
        System.out.println("After updating index 3: " + lists);
        
        // 7. Removing elements
        lists.remove("Banana");
        System.out.println("After removing 'Banana': " + lists);
        lists.remove(2);
        System.out.println("After removing index 2: " + lists);
        
        // 8. Checking if an element exists
        System.out.println("Contains 'Apple'? " + lists.contains("Apple"));

        // 9. Finding index of an element
        System.out.println("Index of 'Fig': " + lists.indexOf("Fig"));
        
        // 10. Sorting the list
        Collections.sort(lists);
        System.out.println("Sort ArrayList " + lists);
        
        // 11. Reversing the list
        Collections.reverse(lists);
        System.out.println("After reversing: " + lists);
        
        // 12. Iterating using a loop
		for(String list : lists) {
			System.out.println("Print Using For Loop "+list);
		}
		
		// 13. Iterating using an iterator
        System.out.println("Iterating using iterator:");
        Iterator<String> iterator = lists.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 14. Converting to an array
        String[] array = lists.toArray(new String[0]);
        System.out.println("Converted to array: ");
        for (String s : array) {
            System.out.print(s +"\t");
        }
        
        System.out.println();
        // 15. Clearing the list
        lists.clear();
        System.out.println("After clearing: " + lists);

        // 16. Checking if the list is empty
        System.out.println("Is the list empty? " + lists.isEmpty());
	}
}
