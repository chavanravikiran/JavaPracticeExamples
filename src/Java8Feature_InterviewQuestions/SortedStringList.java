package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;

//Find Longest
//List<String> word = Arrays.asList("Java", "Stream", "API", "Development");
public class SortedStringList {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Stream", "API", "Development");
		System.out.println(
				words.stream()
				.sorted((x,y)->Integer.compare(y.length(),x.length()))
				.findFirst().get()
		);
	}
}
	