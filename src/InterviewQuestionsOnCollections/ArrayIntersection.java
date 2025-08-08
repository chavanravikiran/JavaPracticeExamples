package InterviewQuestionsOnCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
        findIntersectionUsingStream(arr1,arr2);
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

	private static void findIntersectionUsingStream(int[] arr1, int[] arr2) {
		List<Integer> list1 = Arrays.stream(arr1)
                .boxed() 
                .collect(Collectors.toList());
		
		List<Integer> list2 = Arrays.stream(arr2)
                .boxed() 
                .collect(Collectors.toList());
		
		System.out.println("\nUsing Stream :"+
				list1.stream()
				.filter(x->list2.contains(x))
				.collect(Collectors.toList())
		);
	}
}
