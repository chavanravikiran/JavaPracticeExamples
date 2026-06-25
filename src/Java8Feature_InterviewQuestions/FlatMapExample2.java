package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapExample2 {
	public static void main(String[] args) {
		Map<String,List<Integer>> map = new LinkedHashMap<>();
		
		map.put("Even" ,Arrays.asList(2,4,6,8));
		map.put("Odd" ,Arrays.asList(1,3,5,7));
		
		System.out.println(map);
		
		List<String> key = map.keySet().stream().map(x->x).collect(Collectors.toList());
		System.out.println(key);
		
		//values
		List<Integer> values = map.values().stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(values);
	}
}
