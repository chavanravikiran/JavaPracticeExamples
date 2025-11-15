package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Input : [Ravi","Ram","Ajay","Rahul","Rutuja","Akshay]
//Output :[Rahul, Ram, Ravi, Rutuja]
public class CognizantInterviewQuestion4 {
	public static void main(String[] args) {
		List<String> input = new ArrayList<>(Arrays.asList("Ravi","Ram","Ajay","Rahul","Rutuja","Akshay"));
		
		System.out.println(
				input.stream()
				.filter(x->x.startsWith("R"))
				.sorted()
				.collect(Collectors.toList())
		);
	}
}
