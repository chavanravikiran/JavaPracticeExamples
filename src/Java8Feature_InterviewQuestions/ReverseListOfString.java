package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseListOfString {
	public static void main(String[] args) {
		String str = "Thoughtfully curated rituals, expert hands, and a space designed to help you slow down, reset and glow";
		
	String result =	Arrays.stream(str.split(" "))
		.map(x -> new StringBuilder(x).reverse().toString())
		.collect(Collectors.joining(" "));
	
		System.out.println(result);
	}
}
