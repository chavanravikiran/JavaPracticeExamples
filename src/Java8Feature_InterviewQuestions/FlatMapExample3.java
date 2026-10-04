package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapExample3 {
	public static void main(String[] args) {
		Map<String,List<Integer>> obj = new LinkedHashMap<>();
		obj.put("One", Arrays.asList(1,2,3,4));
		obj.put("Two", Arrays.asList(4,5,6,7));
		obj.put("Three", Arrays.asList(4,8,9));
		
		List<Integer> numbers = obj.values().stream()
		.flatMap(List::stream)
		.collect(Collectors.toList());
		
		System.out.println(numbers); 
	}
}
