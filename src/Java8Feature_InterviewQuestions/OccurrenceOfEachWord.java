package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given a Sentence,find the Occurrence Of Each Word 
//Ex:-I am learing Stream API in Java Java.
//O/P {Java=2,in=1,API=1,learning=1,am=1 ,Stream=1}

public class OccurrenceOfEachWord {
	public static void main(String[] args) {
		String sentence = "I am learing Stream API in Java Java";
		
		Map<String, Long> map = Arrays.stream(sentence.split(" "))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		//Another Way
		Map<String, Long> map1 = Arrays.stream(sentence.split(" "))
					.collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println(map1);
	}
}
