package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountOfLargestElementWithRespectiveSmallest {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(3,1,6,6));
		
		List<Integer> sortedArray = array.stream()
		.sorted()
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println(sortedArray.stream()
		.skip(1)
		.count());
	}
}
