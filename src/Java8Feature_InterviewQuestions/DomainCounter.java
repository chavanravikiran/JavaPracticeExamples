package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find the occurrence of domains using Java streams
public class DomainCounter {

	public static void main(String[] args) {
		List<String> emails = Arrays.asList(
	            "john@gmail.com",
	            "alice@yahoo.com",
	            "bob@gmail.com",
	            "eve@hotmail.com",
	            "jane@yahoo.com",
	            "mark@gmail.com"
	        );
		
		System.out.println(emails.stream()
		.map(x->x.substring(x.indexOf("@")))
		.collect(Collectors.groupingBy(x->x,Collectors.toList())));

	}
}
