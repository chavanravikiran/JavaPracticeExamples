package Collection_ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeOperations {
	public static void main(String[] args) {
        // Creating an ArrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Adding elements
        deque.add(10);  // Adds to the end
        deque.addFirst(20); // Adds to the front
        deque.addLast(30); // Adds to the end
        deque.offer(40);  // Adds to the end
        deque.offerFirst(50); // Adds to the front
        deque.offerLast(60); // Adds to the end

        System.out.println("ArrayDeque: " + deque); // [50, 20, 10, 30, 40, 60]

        // Removing elements
        System.out.println("Removing first: " + deque.pollFirst()); // 50
        System.out.println("Removing last: " + deque.pollLast()); // 60
        System.out.println("ArrayDeque after removals: " + deque); // [20, 10, 30, 40]

        // Peek elements
        System.out.println("First Element: " + deque.peekFirst()); // 20
        System.out.println("Last Element: " + deque.peekLast()); // 40

        // Checking size
        System.out.println("Size: " + deque.size()); // 4

        // Checking if it contains an element
        System.out.println("Contains 30? " + deque.contains(30)); // true

        // Removing a specific element
        deque.remove(30);
        System.out.println("ArrayDeque after remove(30): " + deque); // [20, 10, 40]

        // Checking if empty
        System.out.println("Is Empty? " + deque.isEmpty()); // false

        // Iterating through the elements
        System.out.print("Elements using for-each: ");
        for (Integer num : deque) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Polling all elements until empty
        while (!deque.isEmpty()) {
            System.out.println("Polling: " + deque.poll());
        }

        // Checking again if empty
        System.out.println("Is Empty after polling all? " + deque.isEmpty()); // true
    }
}
