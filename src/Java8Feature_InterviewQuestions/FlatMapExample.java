package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlatMapExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello world", "Java streams");
		
		System.out.println(
				list.stream()
				.flatMap(x->Arrays.stream(x.split(" ")))
				.collect(Collectors.toList())
		);		
	}
}
