package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,4,67,8,9,3);
		System.out.println("Natural Order"+list.stream().sorted().collect(Collectors.toList()));
		
		System.out.println("Reverese Order"+
			list.stream()
			.sorted((x, y) -> Integer.compare(y, x))
			.collect(Collectors.toList())
		);
		System.out.println("Reverse Order "+list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
	}
}
