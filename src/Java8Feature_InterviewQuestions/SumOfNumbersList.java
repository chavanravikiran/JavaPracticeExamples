package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;

//Sum of Numbers in a List
//List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
public class SumOfNumbersList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		usingStream(numbers);
		usingStreamInSum(numbers);
		usingTraditional(numbers);
	}

	private static void usingStreamInSum(List<Integer> numbers) {
		System.out.println(numbers.stream()
		.mapToInt(Integer::intValue).sum());
	}

	private static void usingTraditional(List<Integer> numbers) {
		Integer sum = 0;
		for (Integer no : numbers) {
			sum+=no;
		}
		System.out.println(sum);
	}

	private static void usingStream(List<Integer> numbers) {
		System.out.println(numbers.stream()
		.reduce((x,y)->x+y).get());
		
	}
}
