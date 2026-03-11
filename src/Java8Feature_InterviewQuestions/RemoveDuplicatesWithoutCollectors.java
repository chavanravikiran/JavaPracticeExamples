package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;

//Remove Duplicates Without Collectors
//Question: Remove duplicates from a list using distinct().
public class RemoveDuplicatesWithoutCollectors {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
		
		System.out.println(numbers.stream()
		.distinct().toList());
		
	}
}
