package Collection_LinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {
	public static void main(String[] args) {
       
		// Creating a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements to the LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Initial LinkedList: " + list);

        // Adding elements at specific positions
        list.push(23);//add in first
        list.addFirst(5);//add in first
        list.addLast(60);
        System.out.println("After adding First & Last: " + list);

        // Removing elements
        list.remove(2); // Removes element at index 2
        list.removeFirst(); // Removes first element
        list.removeLast(); // Removes last element
        System.out.println("After removing elements: " + list);

        // Peek (Retrieve but do not remove first element)
        System.out.println("Peek (first element): " + list.peek());

        // Peek Last
        System.out.println("Peek Last (last element): " + list.peekLast());

        // Pop (removes and returns first element)
        System.out.println("Pop (removes first element): " + list.pop());
        System.out.println("After pop operation: " + list);

        // Adding a collection (addAll)
        LinkedList<Integer> newList = new LinkedList<>(Arrays.asList(70, 80, 90));
        list.addAll(newList);
        System.out.println("After addAll(): " + list);

        // Getting a sublist
        List<Integer> subList = list.subList(2, 5);
        System.out.println("SubList (index 2 to 5): " + subList);

        // Sorting the list
        Collections.sort(list);
        System.out.println("After sorting: " + list);

        // Sorting with custom comparator (Descending order)
        list.sort(Comparator.reverseOrder());
        System.out.println("After sorting in descending order: " + list);

        // Retrieving elements without removal
        System.out.println("Retrieve first element: " + list.getFirst());
        System.out.println("Retrieve last element: " + list.getLast());
        
        list.set(0,100);
        System.out.println("update element at 0th index: " + list);
    }
}
