package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class StartWithAndCapitalOutput {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Dilip","Suresh","Dinesh","Deepak","Digvijay","Bhavesh");
		
		String startWith ="D";
		
		List<String> output = names.stream()
		.filter(x->x.startsWith(startWith))
		.map(x->x.toUpperCase())
		.toList();
		
		System.out.println(output);
	}
	
}
