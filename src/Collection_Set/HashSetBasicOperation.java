package Collection_Set;

import java.util.HashSet;
import java.util.Iterator;

// No Insertion Order Maintain
// No Duplicate Element
// Null Allowed but for only one time
// Faster for Searching Operation
// Non Synchronized
public class HashSetBasicOperation {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple"); // Duplicate, will be ignored
        set.add(null);	// Only One time allowed to set null value
        
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
