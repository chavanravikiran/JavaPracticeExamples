package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
//Calculate the average of all the numbers
public class AverageOfListOfInteger {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		System.out.println(list.stream().mapToDouble(x->x).average().getAsDouble());
		System.out.println(list.stream().mapToInt(x->x).sum());
		
	}
}
