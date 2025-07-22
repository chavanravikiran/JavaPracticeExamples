package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingIneger {
	public static void main(String[] args) {
		Integer[] numbers = {4, 2, 5, 4, 2, 3, 5, 8, 9};
		 Integer result = Arrays.stream(numbers)
		            .filter(x -> Collections.frequency(Arrays.asList(numbers), x) == 1)
		            .findFirst()
		            .orElse(null); // use orElseThrow() if you want to throw exception

		 System.out.println("First non-repeating number: " + result);
		 
		 Map<Integer, Long> countMap = Arrays.stream(numbers)
		            .collect(Collectors.groupingBy(
		                Function.identity(), LinkedHashMap::new, Collectors.counting()
		            ));

		        Integer result1 = countMap.entrySet().stream()
		            .filter(e -> e.getValue() == 1)
		            .map(Map.Entry::getKey)
		            .findFirst()
		            .orElse(null);

		        System.out.println("First non-repeating number: " + result1);
	}
}
