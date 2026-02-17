package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Find Duplicate Elements in a List
//List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
public class FindDuplicateElementsInList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
		
		usingStream(numbers);
		usingStreamWay(numbers);
	}

	private static void usingStreamWay(List<Integer> numbers) {
		Set<Integer> set = new LinkedHashSet<>();
		System.out.println(numbers.stream()
		.filter(i->!set.add(i))
		.toList());
		
	}

	private static void usingStream(List<Integer> numbers) {
		System.out.println(numbers.stream()
				.collect(Collectors.groupingBy(x->x,Collectors.counting()))
				.entrySet().stream().filter(x->x.getValue()>=2)
				.collect(Collectors.toList()));		
	}
	
}
