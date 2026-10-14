package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindTheOccurenceOfEachWord {
	public static void main(String[] args) {
		String sentence = "Yes, UnaryOperator and BinaryOperator are functional interfaces in Java. Both are part of the java.util.function package, introduced in Java 8.";
		
		System.out.println(
				Arrays.stream(sentence.split(" "))
				.collect(Collectors.groupingBy(x->x,Collectors.counting()))
		);
	}
}
