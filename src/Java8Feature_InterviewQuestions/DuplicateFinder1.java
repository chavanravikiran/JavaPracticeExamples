package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateFinder1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9);

		List<Integer> result = list.stream()
		.collect(Collectors.groupingBy(x -> x, Collectors.counting()))
		.entrySet().stream()
		.filter(x->x.getValue()>1)
		.map(x->x.getKey())
		.toList();
		
		System.out.println(result);
	}
}
