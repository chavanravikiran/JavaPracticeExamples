package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find and print strings containing only digits
public class StringsContainingOnlyDigits {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("123","sd233","gd35","23","sdsgd");
		
		System.out.println(list.stream().filter(x->x.matches("[0-9]+"))//  [\\d+]
				//.map(x->x)
				.collect(Collectors.toList()));
	}
}
