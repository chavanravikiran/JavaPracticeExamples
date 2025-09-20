package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartitioningEvenAndOdd {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 51, 30, 25, 40, 50,null);
		
		System.out.println(numbers.stream()
				.filter(x-> x != null)
				.collect(Collectors.partitioningBy(x -> x % 2 == 0))
				.entrySet().stream()
				.collect(Collectors.toMap(x->x.getKey() == false ? "Even" : "Odd", x->x.getValue()))
		);
	}
}
