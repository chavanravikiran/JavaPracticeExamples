package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateFinder {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 2, 4, 5, 3, 2, 2);

		 Map<Integer, Long> countMap = numbers.stream()
		            .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

		 Map<Integer, Long> duplicates1  = countMap.entrySet().stream()
		 .filter(e->e.getValue()>1)
		 .collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
		 
		 System.out.println(duplicates1); // Output: {1=2, 2=4, 3=2}
	}
}
