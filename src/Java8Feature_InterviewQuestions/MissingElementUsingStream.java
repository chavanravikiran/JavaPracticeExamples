package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementUsingStream {

	public static void main(String[] args) {
		List<Integer>num = Arrays.asList(2,6,3,4,1);
		
		Collections.sort(num);
		
		Integer actualSum = num.get(num.size()-1)*(num.get(num.size()-1)+1)/2;
		System.out.println(actualSum);
		Integer givenSum=num.stream()
		.reduce(0,(a,b)->(a+b));
		
		System.out.println("Missing Element is "+ (actualSum-givenSum));

	}
}
