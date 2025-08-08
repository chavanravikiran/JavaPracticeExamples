package Collection_PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueMaxHeap {
	 public static void main(String[] args) {
        // Max-Heap (Descending Order)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);

        System.out.println("PriorityQueue (Max-Heap): " + pq);

        // Removing elements (largest first)
        System.out.println("Polling: " + pq.poll()); // 50
        System.out.println("Polling: " + pq.poll()); // 30
        pq.add(100);
        System.out.println("Remaining Queue: " + pq);
	 }
}
