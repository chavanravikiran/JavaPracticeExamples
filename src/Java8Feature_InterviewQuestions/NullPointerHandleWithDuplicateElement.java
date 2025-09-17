package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//I find duplicate element 
public class NullPointerHandleWithDuplicateElement {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Ravi", null, "Rahul", "Sachin", null, "Himanshu", "Rahul", "Sachin"));
		
		System.out.println(
				list.stream()
				.filter(x -> x != null)
				.collect(Collectors.groupingBy(x->x,Collectors.counting()))
				.entrySet().stream()
				.filter(x->x.getValue()>=2)
				.map(x->x.getKey())
				.collect(Collectors.toList())
		);
	}
}
