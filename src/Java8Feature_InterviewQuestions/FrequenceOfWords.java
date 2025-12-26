package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//I/P ["Akshada", "Shinde"];
//O/P {Shinde=1, Akshada=1}
public class FrequenceOfWords {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Akshada","Shinde");
		
		System.out.println(
				list.stream()
		.collect(Collectors.groupingBy(x->x,Collectors.counting()))
		);
	}
}
