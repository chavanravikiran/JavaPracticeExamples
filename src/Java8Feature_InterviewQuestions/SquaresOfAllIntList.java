package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Square of All elelemtns from Integer List
public class SquaresOfAllIntList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		System.out.println(list.stream()
		.map(x->x*x)
		.collect(Collectors.toList()));
	}
}
