package InterviewQuestionsOnCollections;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordCount {
	public static void main(String[] args) {
		String sentence = "java spring java docker spring boot java";
		
		System.out.println(Arrays.stream(sentence.split(" "))
		.collect(Collectors.groupingBy(x->x,Collectors.counting())));
		
	}
}
