package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionNumbersIntoEvenAndOddPractice {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,5,5,6,77,8,9,34,5,73,35,325,null);
		
		Map<Object, Object> result = numbers.stream()
		.filter(x->x!=null)
		.collect(Collectors.partitioningBy(x->x%2==0))
		.entrySet().stream()
		.collect(Collectors.toMap(x->x.getKey()==false ? "Odd" : "Even", x->x.getValue()));
		
		System.out.println(result);
		
	}
}
