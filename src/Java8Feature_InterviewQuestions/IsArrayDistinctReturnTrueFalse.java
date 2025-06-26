package Java8Feature_InterviewQuestions;

import java.util.Arrays;

//in a given of integers,return true if it contains disticnt values and false otherwise
public class IsArrayDistinctReturnTrueFalse {
	public static void main(String[] args) {
		int a[]= {0,2,3,5,0};
	
		boolean isDistinct = Arrays.stream(a).boxed().distinct().count() == a.length;
		System.out.println(isDistinct);
	}
}
