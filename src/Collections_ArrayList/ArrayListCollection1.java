package Collections_ArrayList;

import java.util.ArrayList;
import java.util.List;

//ArrayList is non-synchronized
//ArrayList available in Java.util package
//Implement from List Interface
//Based on Array data Structure
//ArrayList is resizable (Dyanimc Size)
//Array is fix size but ArrayList is size grow /shring  at runtime
//It Maintained Insertion Order
//Random Access is Possible
//It can store duplicate Element
//Array List is Slow as compare to LinkedList
public class ArrayListCollection1 {
	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();

		// Adding elements in the list1.
		al.add("Apple");
		al.add("Mango");
		al.add("Orange");
		al.add("Grapes");
		System.out.println("List1 contain: " + al);

		// Create another list2 of String type.
		List<String> al2 = new ArrayList<String>();
		al2.add("11");
		al2.add("12");
		al2.add("13");
		System.out.println("List2 contain :-" + al2);

		// Adding list2 in list1 at 2nd position (i.e. index = 2) using addAll() method.
		al.addAll(2, al2);
		System.out.println("List1 after adding List2 at 2nd position: " + al);
	}
}
