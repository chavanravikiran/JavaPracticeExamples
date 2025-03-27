package InterviewQuestionsOnCollections;

import java.util.HashSet;
import java.util.Set;

// Question:-Find Intersection of Two Arrays using Set 
// Output :-Intersection: 2 3 5 
// Common Value Reterns
public class ArrayIntersection {
	 public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 5, 6};

        Set<Integer> intersection = findIntersection(arr1, arr2);

        // Print the result
        System.out.print("Intersection: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }

	private static Set<Integer> findIntersection(int[] arr1, int[] arr2) {
		Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        // Step 1: Add elements of arr1 to the set
        for (int num : arr1) {
            set1.add(num);
        }

        // Step 2: Check for common elements in arr2
        for (int num : arr2) {
            if (set1.contains(num)) {
                resultSet.add(num); // Add to result set to avoid duplicates
            }
        }
        
		return resultSet;
	}
}
