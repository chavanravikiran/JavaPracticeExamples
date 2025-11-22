package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

// int a[] ={1,2,3,4,5,6,7,8,9,10}
// find 3rd largest element
public class TCSQuestionsNo2 {
	public static void main(String[] args) {
		int a[] ={1,2,3,4,5,6,7,8,9,10};
		
		int k=3;
		int highest =Arrays.stream(a)
		.boxed()
		.distinct()
		.sorted(Collections.reverseOrder())
		.skip(k-1)
		.findFirst()
		.get();
		
		System.out.println(highest);
	}
}
