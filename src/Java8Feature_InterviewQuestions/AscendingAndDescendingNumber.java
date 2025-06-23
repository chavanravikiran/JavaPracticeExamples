package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingAndDescendingNumber {
	public static void main(String[] args) {
		int a[]= {2,4,2,5,1};
		
		List<Integer> arrayAsc = Arrays.stream(a).boxed()
			.sorted()
			.collect(Collectors.toList());
		System.out.println(arrayAsc);
		
		List<Integer> arrayReverse = Arrays.stream(a).boxed()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(arrayReverse);
	}
}
