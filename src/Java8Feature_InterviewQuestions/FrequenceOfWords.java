package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//List<String> list = Arrays.asList(“Akshada”, “Shinde”);
public class FrequenceOfWords {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Akshada","Shinde");
		
		System.out.println(
				list.stream()
		.collect(Collectors.groupingBy(x->x,Collectors.counting()))
		);
	}
}
