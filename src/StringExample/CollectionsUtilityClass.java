package StringExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilityClass{
	public static void main(String[] args) {
		 // Creating a List of integers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3, 8, 2, 5));

        System.out.println("Original List: " + numbers);

        // 1️⃣ Sorting the list in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted List (Ascending): " + numbers);

        // 2️⃣ Sorting the list in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted List (Descending): " + numbers);

        // 3️⃣ Reversing the list
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        // 4️⃣ Shuffling the list (Random Order)
        Collections.shuffle(numbers);
        System.out.println("Shuffled List: " + numbers);

        // 5️⃣ Finding Maximum & Minimum Elements
        System.out.println("Max Element: " + Collections.max(numbers));
        System.out.println("Min Element: " + Collections.min(numbers));

        // 6️⃣ Counting Frequency of an Element
        System.out.println("Frequency of 8: " + Collections.frequency(numbers, 8));

        // 7️⃣ Performing Binary Search (List must be sorted first)
        Collections.sort(numbers);
        int index = Collections.binarySearch(numbers, 5);
        System.out.println("Index of 5 (Binary Search): " + index);

        // 8️⃣ Making the List Unmodifiable (Immutable)
        List<Integer> unmodifiableList = Collections.unmodifiableList(numbers);
        System.out.println("Unmodifiable List: " + unmodifiableList);
        // unmodifiableList.add(10);  // ❌ Throws Exception: UnsupportedOperationException

        // 9️⃣ Making a Synchronized List (Thread-Safe)
        List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>(numbers));

        // Accessing synchronizedList in a synchronized block
        synchronized (synchronizedList) {
            for (int num : synchronizedList) {
                System.out.print(num + " ");
            }
            System.out.println("\nSynchronized List Accessed");
        }
    }
}
