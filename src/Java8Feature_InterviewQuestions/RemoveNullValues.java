package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Remove Null Values
public class RemoveNullValues {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", null, "Stream", null, "API", "" , " ");
		
		List<String> output = words.stream()
		.filter(x->x != null && !x.isBlank())
		.collect(Collectors.toList());
	
		System.out.println(output);
	}
}
