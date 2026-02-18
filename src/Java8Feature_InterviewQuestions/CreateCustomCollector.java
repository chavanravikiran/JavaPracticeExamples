package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Create Custom Collector 
//List<String> words = Arrays.asList("Java", "Stream", "API");
//o/p:- Output: Java, Stream, API
public class CreateCustomCollector {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Stream", "API");
		
		usingStream(words);
		usingTraditional(words);
	}

	private static void usingStream(List<String> words) {
		String output  = words.stream().collect(Collectors.joining(", "));
		System.out.println(output);		
	}

	private static void usingTraditional(List<String> words) {
		String output = null;
		for (int i = 0; i < words.size(); i++) {
			System.out.print(words.get(i));
			if(i < words.size()-1) {
				System.out.print(", ");
			}
		}
		
	}
	
}
