package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NullPointerHandleStream {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Ravi", null, "Rahul", "Sachin", null, "Himanshu"));
		
		System.out.println(
				list.stream()
			.filter(x -> x != null && x.length()>=6)
			.collect(Collectors.toList())
		);
	}
}
