package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find the intersection of two lists using Java streams
public class IntersectionElementFromTwoList {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList(2,4,5,6,7);
		
		System.out.println(list1.stream().filter(x->list2.contains(x)).collect(Collectors.toList()));
	}
}
