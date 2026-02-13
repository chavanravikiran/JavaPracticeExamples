package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Count Strings with Specific Prefix
//List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
public class CountStringsWithSpecificPrefix {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
		
		System.out.println(
			names.stream().filter(x->x.startsWith("A"))
			.count()
		);
		
		System.out.println(
				names.stream()
		.collect(Collectors.groupingBy(x->x.startsWith("A"),Collectors.counting()))
		.entrySet().stream().filter(x->x.getKey()==true).map(x->x.getValue())
		.collect(Collectors.toList()).get(0)
		);
	}
}
