package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindDuplicateChar {
	public static void main(String[] args) {
		String str = "pprogramming";
		
		System.out.println(Arrays.stream(str.split(""))
			.collect(Collectors.groupingBy(x->x,Collectors.counting()))
			.entrySet().stream()
			.filter(x->x.getValue()>1)
			.map(x->x.getKey())
			.collect(Collectors.joining(","))
		);
		
		//First Non Reapiting Char
		System.out.println(Arrays.stream(str.split(""))
		.filter(x -> str.indexOf(x) == str.lastIndexOf(x))
		.findFirst()
		.get()
		);
		
		//Reverse String
		System.out.println(Arrays.stream(str.split(""))
		.map(x -> new StringBuilder(str).reverse())
		.findFirst()
		);
		
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(reversed);
		
		
	}
}
