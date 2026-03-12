package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;

//Find the Sum of Squares of Even Numbers
//Calculate the sum of squares of all even numbers in a list.
//Output 56
public class FindTheSumSquaresEvenNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		System.out.println(numbers.stream()
			.filter(x->x%2==0)
			.map(x -> x * x)
	        .reduce(0, (x, y) -> x + y)
		);
	}
}
