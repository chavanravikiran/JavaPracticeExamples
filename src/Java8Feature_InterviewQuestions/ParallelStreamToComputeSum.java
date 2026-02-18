package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Parallel Stream to Compute Sum
public class ParallelStreamToComputeSum {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> output= numbers.parallelStream().reduce((x,y)->(x+y));
		
		System.out.println("First Way "+output.get());
		
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers1.parallelStream()
		    .mapToInt(Integer::intValue)
		    .sum();
		System.out.println("Second Way "+sum);
	}
}
