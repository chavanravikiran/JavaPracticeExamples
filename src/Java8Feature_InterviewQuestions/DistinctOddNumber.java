package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find Distinct Odd Number from Given List of array
public class DistinctOddNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,2,3,11,12,4,5,6);
		
		System.out.println(
		list.stream()
		.filter(x -> x%2 != 0)
		.distinct()
		.collect(Collectors.toList()));
	}
}
