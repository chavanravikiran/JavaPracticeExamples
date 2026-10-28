package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

//Find the Longest Word in a sentence ingoring Case and Punctuation
public class FindLongestWordInSentenceIngoringCaseAndPunctuation {
	public static void main(String[] args) {
		String sentence = "The quick , brown fox jumped over the lazy dog !";
		
		System.out.println(Arrays.stream(sentence.toLowerCase().replaceAll("[^a-z\\s]", "").split(" "))
		.collect(Collectors.toMap(x->x, x->x.length(),(old,newValue)->newValue))
		.entrySet().stream()
		.sorted((x,y)->Integer.compare(y.getValue(), x.getValue()))
		.findFirst().map(x->x.getKey()).get()
		);
	}
}
