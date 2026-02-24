package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Partition Numbers into Even and Odd
//List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//Output: {false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8]}
public class PartitionNumbersIntoEvenAndOdd {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		System.out.println(numbers.stream()
		.collect(Collectors.partitioningBy(x->x%2==0)));
	}
}
