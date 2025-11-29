package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Input : [1, 1, 1, 3, [[[[4]]], 2, 6, 5]]
// Output : [1, 2, 3, 4, 5, 6]
public class FlattenList {
	 public static void main(String[] args) {
	        
	        List<Object> input = Arrays.asList(
	                1,1,1,3,
	                Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList(4))), 2, 6, 5)
	        );

	        System.out.println(input);
	        List<Integer> result = flattenUniqueSorted(input);
	        
	        
	    }
	 
	 // Flatten + Remove duplicates + Sort
	    public static List<Integer> flattenUniqueSorted(List<Object> list) {
	        List<Integer> flat = new ArrayList<>();
	        flatten(list, flat);

	        // unique + sorted
	        return flat.stream()
	                   .distinct()
	                   .sorted()
	                   .toList();
	    }
	    
	 // Recursive flatten
	    public static void flatten(List<?> list, List<Integer> flat) {
	        for (Object obj : list) {
	            if (obj instanceof Integer) {
	                flat.add((Integer) obj);
	            } else if (obj instanceof List<?>) {
	                flatten((List<?>) obj, flat);  // recursive call
	            }
	        }
	    }
}
