package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountOccurance {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","banana","apple","orange","banana","apple");
		
		Map<String,Long> occuranceCount = list.stream()
		.collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
		System.out.println(occuranceCount);
		
	}
}
