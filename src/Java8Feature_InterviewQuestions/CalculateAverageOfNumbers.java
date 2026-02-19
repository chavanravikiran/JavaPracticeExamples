package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Calculate Average of Numbers
public class CalculateAverageOfNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		
		Double avg = numbers.stream()
		.collect(Collectors.summarizingDouble(x->x)).getAverage();
		
		System.out.println(avg);
		
//		| Complexity Type  | Value    |
//		| ---------------- | -------- |
//		| Time Complexity  | **O(n)** |
//		| Space Complexity | **O(1)** |

	}
}
