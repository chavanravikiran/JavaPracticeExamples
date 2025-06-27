package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;

//Find the kth smallest element in a list of integers.
public class SkipNthElementFromList {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,2,5,7,3,2);
		
		int secondElement = list.stream().sorted().skip(2).findFirst().get();
		System.out.println(secondElement);
		
	}
}
