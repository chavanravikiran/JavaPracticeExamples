package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnionOfTwoList {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList(6,7,8,9,10);
		
		System.out.println(
				Stream.concat(list1.stream(),list2.stream())
				.collect(Collectors.toList())
		);
	
	}
}
