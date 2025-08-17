package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ravi","chavan","Kiran","Ravikiran","Suryakiran","ravikishor");
		System.out.println(
				names.stream()
			.filter(x->x.toLowerCase().startsWith("r"))
			.collect(Collectors.toList())
		);
	}
}
