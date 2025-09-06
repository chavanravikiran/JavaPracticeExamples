package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartEndSameChar {
	public static void main(String[] args) {
		
		String sentence = "apple anna civic banana level";
		
		List<String> result = Arrays.stream(sentence.split(" "))
		.filter(x->x.charAt(0)== x.charAt(x.length()-1))
		.collect(Collectors.toList());
		
		System.out.println(result);
	}
}
