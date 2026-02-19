package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Collect Map from List
//List<String> words = Arrays.asList("Java", "Stream", "API");
//
//Output: {Java=4, Stream=6, API=3}
public class CollectMapFromList {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Stream", "API");
		
		Map<Object, Object> map = words.stream()
		.collect(Collectors.toMap(x->x, x->x.length()));
		
		System.out.println(map);
	}
}
