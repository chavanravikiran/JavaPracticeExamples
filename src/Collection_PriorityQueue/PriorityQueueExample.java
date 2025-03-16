package Collection_PriorityQueue;

import java.util.PriorityQueue;

//Orders elements based on priority
//Does not allow null elements.
//Duplicates are allowed.
//Not thread-safe
//smallest element is at the head
//Priority Queue Does not follow the FIFO Rule.
public class PriorityQueueExample {

	public static void main(String[] args) {
        // Creating a PriorityQueue (Min-Heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);
        pq.add(20);

        System.out.println("PriorityQueue: " + pq); // Order may not be sorted when printed

        // Removing elements (smallest first)
        System.out.println("Polling: " + pq.poll()); // 10 (smallest)
        System.out.println("Polling: " + pq.poll()); // 20
        System.out.println("Remaining Queue: " + pq);// [30,50]
    }
}
