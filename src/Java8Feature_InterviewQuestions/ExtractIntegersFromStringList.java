package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

//To extract only integer values from a List<String>, you can use Java 8 Streams and filter strings that are valid integers.
public class ExtractIntegersFromStringList {
	public static void main(String[] args) {
		String[] s= {"ravi","123","kiran","223","23r"};
		
		System.out.println(
				Arrays.stream(s)
				.filter(x->x.matches("[0-9]+")) //this or below this
//				.filter(x->x.matches("\\d+")) //this is alos work
				.collect(Collectors.toList())
		);
		
		//Return only two first element 
		System.out.println(Arrays.stream(s).limit(2).collect(Collectors.toList()));
	}
}
