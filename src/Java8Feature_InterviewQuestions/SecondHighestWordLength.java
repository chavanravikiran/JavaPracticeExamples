package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class SecondHighestWordLength {
	public static void main(String[] args) {
		 String sentence = "I love programming in Java streams";
		
		 usingStreamMap(sentence);
		 usingStreamCompare(sentence);
	}

	private static void usingStreamCompare(String sentence) {
		System.out.println("Using Compare method : "+Arrays.stream(sentence.split(" "))
		.sorted((x,y)->Integer.compare(y.length(), x.length()))
		.skip(1)
		.findFirst().get()
		);
	}
	
	static void usingStreamMap(String sentence) {
		 Integer length =  Arrays.stream(sentence.split(" "))
				  .map(x->x.length())
				  .sorted(Collections.reverseOrder())
				  .skip(1)
				  .findFirst()
				  .get();
			  
			  System.out.println("Using Stream Map : "+Arrays.stream(sentence.split(" "))
				  .filter(x->x.length() == length)
				  .collect(Collectors.toList()).get(0)
			  );
	}
}
