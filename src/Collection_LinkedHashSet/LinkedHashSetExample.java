package Collection_LinkedHashSet;

import java.util.LinkedHashSet;

// No duplicate allowed
// Maintain Insertion Order
// allowed Only one null value
// Non Synchonize
// Slower as compare to Hashset
public class LinkedHashSetExample {
	public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(5); // Duplicate, will be ignored

        System.out.println("LinkedHashSet: " + set);
    }
}
