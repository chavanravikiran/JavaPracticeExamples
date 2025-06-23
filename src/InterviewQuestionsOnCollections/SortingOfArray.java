package InterviewQuestionsOnCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class SortingOfArray {
	public static void main(String[] args) {
		Integer arr[]= {10,12,4,5,7,3,4,2};
		
		usingTraditionalWay(arr);
		usingStream(arr);
	}


	private static void usingTraditionalWay(Integer[] arr) {
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, Collections.reverseOrder()); // Descending order
        System.out.println("Descending: " + Arrays.toString(arr));
        
	}
	
	private static void usingStream(Integer[] arr) {
		System.out.println("Ascending (Stream): " + 
		        Arrays.stream(arr)                       // Convert to Stream<Integer>
		              .sorted()                          // Sort ascending
		              .collect(Collectors.toList()));
		
		System.out.println("Descending (Stream): " + 
		        Arrays.stream(arr)
		              .sorted(Collections.reverseOrder()) // Sort descending
		              .collect(Collectors.toList()));
		
	}

}
