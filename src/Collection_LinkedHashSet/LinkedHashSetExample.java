package Collection_LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

// No duplicate allowed
// Maintain Insertion Order
// allowed Only one null value
// Non Synchonize
// Slower as compare to Hashset
// Only Iterator is applicable for LinkedHashSet but in below i have to use for-each because for-each internally use iterator
public class LinkedHashSetExample {
	public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(5); // Duplicate, will be ignored

        System.out.println("LinkedHashSet: " + set);
        
        for (Integer itr : set) {
        	System.out.println("itr "+itr);
		}
        
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println("itr " + itr.next());
        }
    }
}
