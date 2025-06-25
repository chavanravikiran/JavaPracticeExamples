package Java8Feature_InterviewQuestions;

import java.util.Arrays;

//Get Product of first 2 element 
public class GetProductOfIntArray {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6};
		
		int product = Arrays.stream(a).boxed()
                .limit(2)
                .reduce(1, (x, y) -> x * y); 
		System.out.println(product);
	}
}
