package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;

//Check if Any String Matches a Condition
public class CheckIfAnyStringMatchesCondition {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Java", "Stream API", "Lambda");
		
		System.out.println(strings.stream()
		.anyMatch(x->x.contains("Java")));
	}
}
