package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfStringsInAlphabeticalOrder {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("Puna","Zudio","Addidas","Nike","New Balance","H&M");
		
		System.out.println(str.stream()
				.sorted()
				.collect(Collectors.toList())
		);
		
		//Reverse Order
		System.out.println(str.stream()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList())
		);
	}
}
