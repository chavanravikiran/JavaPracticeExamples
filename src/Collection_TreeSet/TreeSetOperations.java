package Collection_TreeSet;

import java.util.TreeSet;

public class TreeSetOperations {
	public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        
        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("TreeSet: " + numbers);
        
        // Higher (Finds the next higher element)
        System.out.println("Higher than 20: " + numbers.higher(20));  // 30 

        // Lower (Finds the next lower element.)
        System.out.println("Lower than 20: " + numbers.lower(20));    // 10
        
        // Ceiling (≥ given element - higher)
        System.out.println("Ceiling of 25: " + numbers.ceiling(25));  // 30
        
        // Floor (≤ given element below)
        System.out.println("Floor of 25: " + numbers.floor(25));      // 20
        
        // First and Last elements
        System.out.println("First Element: " + numbers.first());      // 10
        System.out.println("Last Element: " + numbers.last());        // 50
        
        // Checks if the set is empty	
        System.out.println("Is TreeSet empty? " + numbers.isEmpty()); // false
        
        // Getting size
        System.out.println("Size of TreeSet: " + numbers.size());     // 5
        
        // Removing elements using pollFirst and pollLast--Removes & returns the first or last element
        System.out.println("Removed first element: " + numbers.pollFirst()); // Removes 10
        System.out.println("Removed last element: " + numbers.pollLast());   // Removes 50
        
        numbers.add(60);
        System.out.println("Removed function element 40: " + numbers.remove(40)); // true
        
        // Displaying final TreeSet
        System.out.println("Updated TreeSet: " + numbers);
        
	}
}
