package Collections_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ForwardBackwordDirectionPrint {
	public static void main(String[] args) {
		List<String> lists = new ArrayList<>();
		lists.add("Ravi");
		lists.add("Kiran");
		lists.add("Chavan");
		
		// Using for loop
		System.out.println("********* Forward using Traditional Way: *********");
		for (String list : lists) {
			System.out.println(list);
		}
		
		//Forward -  Using Iterator
        System.out.println("********* Forward using Iterator: *********");
        Iterator<String> it = lists.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        // Backward - Using Iterator
        System.out.println("********* Backword using Iterator: *********");
        ListIterator<String> listIterator = lists.listIterator(lists.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
	}
}
