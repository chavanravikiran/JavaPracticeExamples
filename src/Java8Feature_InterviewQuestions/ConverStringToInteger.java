package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ConverStringToInteger {
	public static void main(String[] args) {
		String []a = {"2","3","7","1","8"};
		ArrayList<String> str = new ArrayList<>(Arrays.asList(a));
		
		System.out.println(
				str.stream()
				.map(x -> Integer.parseInt(x))
//				.map(Integer::parseInt) 
				.collect(Collectors.toList())
				
		);
	}
}
