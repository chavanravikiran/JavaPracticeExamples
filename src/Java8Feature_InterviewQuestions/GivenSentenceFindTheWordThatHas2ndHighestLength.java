package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;

public class GivenSentenceFindTheWordThatHas2ndHighestLength {
	public static void main(String[] args) {
		String sentence = "I am Learing Stream API in Java";
		System.out.println("2nd Largest Element :"+

				Arrays.stream(sentence.split(" "))
				.sorted((y, x) -> Integer.compare(x.length(), y.length()))
				.skip(1)
				.findFirst().get()
		);
		
		System.out.println("2nd Smallest Element :"+

				Arrays.stream(sentence.split(" "))
				.sorted(Comparator.comparing(String::length))
				.skip(1)
				.findFirst()
				.get()
		);
		
		
	}
}
