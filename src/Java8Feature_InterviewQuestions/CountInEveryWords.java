package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

//I want to place in good company in next week
public class CountInEveryWords {
	public static void main(String[] args) {
		String target = "I want to place in good company in next week";
		
		System.out.println(Arrays.stream(target.split(" "))
		.map(x->x.length())
		.collect(Collectors.toList()));
		
	}
}
