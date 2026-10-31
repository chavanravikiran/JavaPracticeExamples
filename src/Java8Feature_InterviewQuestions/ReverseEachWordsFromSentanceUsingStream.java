package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

//Reverse Each Words From Sentance using Stream
public class ReverseEachWordsFromSentanceUsingStream {
	public static void main(String[] args) {
		String sentance = "Java Streams are powerful";
		
		String result = Arrays.stream(sentance.split(" "))
		.map(x->new StringBuilder(x).reverse())
		.collect(Collectors.joining(" "));

		System.out.println(result);
	}
}
