package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Filter Even Numbers from a List
//(1, 2, 3, 4, 5, 6)
public class EvenOddFindOut {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		System.out.println("Even List : "+list.stream()
		.filter(x->x %2==0)
		.collect(Collectors.toList()));
		
		System.out.println("Odd List : "+list.stream()
		.filter(x->x %2 !=0)
		.collect(Collectors.toList()));
		
		
	}
}
