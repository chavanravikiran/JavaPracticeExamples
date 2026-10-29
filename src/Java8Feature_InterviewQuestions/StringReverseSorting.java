package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

//O/p : edcba
public class StringReverseSorting {
	public static void main(String[] args) {
		String str = "debac";
		
		String result = Arrays.stream(str.split(""))
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.joining());
		
		System.out.println(result);
		
		subStringMethod();
	}
	
	private static void subStringMethod() {
		String substring = "what is your name what is your name what are you doing";
		String find = "what";
		
		System.out.println(substring.split(find).length-1);
	}

	
	
}
