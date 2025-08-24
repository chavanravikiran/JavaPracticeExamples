package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingElementWithStream {
	public static void main(String[] args) {
		int a[]= {1,2,6,7,6,3,7,8,9};
		
		Set<Integer> set = Arrays.stream(a)
						.boxed()
						.collect(Collectors.toSet());
		
		System.out.println(
				IntStream.rangeClosed(1, 9)
				.filter(x->!set.contains(x))
				.boxed().toList()
		);
		
	}
}
