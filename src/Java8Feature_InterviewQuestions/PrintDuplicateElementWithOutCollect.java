package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

//How to find duplicate elements in a List using Java 8 (only print, no collect)?
public class PrintDuplicateElementWithOutCollect {
	public static void main(String[] args) {
		List<String> str = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "d", "b"));
		
		HashSet<String> arr = new HashSet<>();
		
		str.stream()
		.filter(x->!arr.add(x)) // add() returns false for duplicates
		.forEach(System.out::println);
		
		str.stream()
	    .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
	    .entrySet().stream()
	    .filter(x -> x.getValue() > 1)
	    .forEach(x -> System.out.println(x.getKey()));
	}
}
