package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAverage {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5,10,15,20,25);
		
		double avg =numbers.stream()
		.mapToInt(Integer::intValue)
		.average().orElse(0);
		
		System.out.println(avg);
		
		double avg1 = numbers.stream()
				.reduce(0, (x , y) -> (x + y))/numbers.size();

		System.out.println(avg1);
		
		double avg2 = numbers.stream()
		        .collect(Collectors.averagingInt(x->x));

		System.out.println(avg2);
	}
}
