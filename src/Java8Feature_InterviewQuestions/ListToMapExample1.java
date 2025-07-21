package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//To Convert List to Map
public class ListToMapExample1 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(13);
		numbers.add(12);
		numbers.add(14);
		
		Map<Integer,Integer> num = numbers.stream()
									.collect(Collectors.toMap(x->x, x->x));
		
		System.out.println(num);
	}
}
