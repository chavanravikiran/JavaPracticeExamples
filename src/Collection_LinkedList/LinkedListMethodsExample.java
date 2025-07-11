package Collection_LinkedList;

import java.util.LinkedList;

public class LinkedListMethodsExample {
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
	
		System.out.println("=== Adding Elements ===");
		
		// 1. addFirst(Object o)
        list.addFirst("First");
        System.out.println("After addFirst: " + list);

        // 2. addLast(Object o)
        list.addLast("Last");
        System.out.println("After addLast: " + list);

        // 7. offerFirst(Object o)-It is used to insert the specified element at the front of a list.
        list.offerFirst("OfferFirst");
        System.out.println("After offerFirst: " + list);

        // 8. offerLast(Object o)-It is used to insert the specified element at the end of a list.
        list.offerLast("OfferLast");
        System.out.println("After offerLast: " + list);

        // 16. push(Object o)--This method is used to push an element onto the stack represented by a list.
        list.push("PushElement");
        System.out.println("After push: " + list);

        System.out.println("\n=== Accessing Elements ===");

        // 3. getFirst()
        System.out.println("getFirst(): " + list.getFirst());

        // 4. getLast()
        System.out.println("getLast(): " + list.getLast());

        // 9. peek()--It retrieves the first element from the linked list
        System.out.println("peek(): " + list.peek());

        // 10. peekFirst()--It is used to retrieve the first element from the linked list. It will return null if the list is empty.
        System.out.println("peekFirst(): " + list.peekFirst());

        // 11. peekLast()--It is used to retrieve the last element from the linked list. It will return null if the list is empty.
        System.out.println("peekLast(): " + list.peekLast());

        System.out.println("\n=== Removing Elements ===");

        // 5. removeFirst()
        System.out.println("removeFirst(): " + list.removeFirst());
        System.out.println("List after removeFirst: " + list);

        // 6. removeLast()
        System.out.println("removeLast(): " + list.removeLast());
        System.out.println("List after removeLast: " + list);

        // 12. poll()--It retrieves and removes the first element from the linked list.
        System.out.println("poll(): " + list.poll());
        System.out.println("List after poll: " + list);

        // 13. pollFirst()
        System.out.println("pollFirst(): " + list.pollFirst());
        System.out.println("List after pollFirst: " + list);

        // 14. pollLast()
        System.out.println("pollLast(): " + list.pollLast());
        System.out.println("List after pollLast: " + list);

        // Adding elements to test pop
        list.push("Element1");
        list.push("Element2");
        list.push("Element3");
        System.out.println("\nList before pop: " + list);

        // 15. pop()--This method is used to pop an element from the stack represented by a list.
        System.out.println("pop(): " + list.pop());
        System.out.println("List after pop: " + list);
	}
}
