package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find Common Elements Between Two Lists
//Question: Find common elements between two lists.
//output [3, 4, 5]
public class FindCommonElementsBetweenTwoLists {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
		
		System.out.println(list1.stream()
		.filter(x->list2.contains(x))
		.collect(Collectors.toList()));
	}
}
