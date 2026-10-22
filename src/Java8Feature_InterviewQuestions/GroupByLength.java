package Java8Feature_InterviewQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class GroupByLength {
	public static void main(String[] args) {
		List<String> list = List.of("Apple","Bat","Ball","Cat","Banana","Dog","Goat");
		
		System.out.println(list.stream()
		.collect(Collectors.groupingBy(x->x.length())));
		
	}
}
