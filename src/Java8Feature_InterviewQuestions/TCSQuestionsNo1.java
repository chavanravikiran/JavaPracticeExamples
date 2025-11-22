package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

//int a[] ={1,2,3,4,5,6,7,8,9,10}
//{Even=[2, 4, 6, 8, 10], Odd=[1, 3, 5, 7, 9]}
public class TCSQuestionsNo1 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(
				Arrays.stream(a)
		        .boxed()
		        .collect(Collectors.partitioningBy(x->x%2==0))
		        .entrySet().stream()
		        .collect(Collectors.toMap(x->x.getKey() == true ? "Even" : "Odd", x->x.getValue()))
		);
	}
}
