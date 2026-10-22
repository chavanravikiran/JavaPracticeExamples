package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentCharacters {
	public static void main(String[] args) {
		String str = "banana";
		
		Map<Object, Long> frequence = Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
		System.out.println(frequence);
		
		//i need only Characters
		System.out.println(
				Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(x->x,Collectors.counting()))
				.entrySet().stream()
				.sorted((x,y)->Long.compare(y.getValue(), x.getValue()))
				.map(x->x.getKey())
				.findFirst().get()
		);
		
		
	}
}	
