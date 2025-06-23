package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfUniqueElement {
	
	public static void main(String[] args) {
		int a[]= {1,4,2,5,2,1,2,3};
		System.out.println(Arrays.stream(a).boxed().distinct().collect(Collectors.summingInt(x->x)));
		System.out.println(Arrays.stream(a).distinct().sum());
	}
}
