package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Find the Max in List
public class FindMaximumInList {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,4,67,8,9,3);
		System.out.println("Max using Comparator: "+list.stream()
		.sorted(Comparator.reverseOrder())
		.findFirst().get());
		
		System.out.println("Max using Max: "+list.stream()
		.max(Comparator.reverseOrder())
		.get());
		
		
	}
}
