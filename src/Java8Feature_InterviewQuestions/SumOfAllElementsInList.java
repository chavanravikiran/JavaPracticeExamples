package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;

//Find the sum of all the elements in a list.
public class SumOfAllElementsInList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		int sum=list.stream().mapToInt(x->x).sum();
		System.out.println(sum);
	}
}
