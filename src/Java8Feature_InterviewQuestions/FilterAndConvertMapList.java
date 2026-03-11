package Java8Feature_InterviewQuestions;

import java.util.Map;
import java.util.stream.Collectors;

//Filter and Convert Map to List value is greater than 10
//ListMap<String, Integer> map = Map.of("A", 5, "B", 15, "C", 10, "D", 20);
//output : [B, D]
public class FilterAndConvertMapList {
	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("A", 5, "B", 15, "C", 10, "D", 20);
		
		System.out.println(map.entrySet().stream().filter(x->x.getValue()>10).map(x->x.getKey())
				.collect(Collectors.toList()));
	}
}
