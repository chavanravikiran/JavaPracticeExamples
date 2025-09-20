package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//merge -> Remove Duplicate and return single String 
public class MergeListInOneAndRevemoDuplicate {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>(Arrays.asList("A","B","C","D"));
		List<String> l2 = new ArrayList<>(Arrays.asList("A","F","H","D"));
		
		System.out.println(
		Stream.of(l1,l2)
		.flatMap(List::stream)
		.distinct()
		.collect(Collectors.toList())
		);
	}
}
