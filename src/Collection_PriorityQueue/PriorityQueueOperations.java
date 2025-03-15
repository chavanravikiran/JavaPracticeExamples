package Collection_PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueOperations {
    public static void main(String[] args) {

    	// Creating a Min-Heap PriorityQueue (Default: Smallest element has highest priority)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);
        pq.offer(40); // offer() also adds elements

        System.out.println("PriorityQueue: " + pq);

        // Peek (Get highest priority element without removing)
        System.out.println("Peek (Top Element): " + pq.peek()); // 10 (smallest)

        // Poll (Remove and return highest priority element)
        System.out.println("Polling: " + pq.poll()); // Removes 10
        System.out.println("PriorityQueue after poll: " + pq);

        // Remove a specific element
        boolean removed = pq.remove(30); // Removes 30
        System.out.println("Was 30 removed? " + removed);
        System.out.println("PriorityQueue after remove(30): " + pq);

        // Check if a specific element exists
        System.out.println("Contains 50? " + pq.contains(50)); // true

        // Get the size of the queue
        System.out.println("Size of PriorityQueue: " + pq.size()); // 3 elements left

        // Convert PriorityQueue to Array
        Object[] arr = pq.toArray();
        System.out.print("Elements in array format: ");
        for (Object num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Polling all elements until empty
        while (!pq.isEmpty()) {
            System.out.println("Polling: " + pq.poll());
        }

        // Check if empty
        System.out.println("Is PriorityQueue empty? " + pq.isEmpty()); // true
    }
}
