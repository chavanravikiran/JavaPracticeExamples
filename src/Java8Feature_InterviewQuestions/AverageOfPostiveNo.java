package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageOfPostiveNo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(-3,-2,0,-7,25,12,-11);
		
		usingTraditionWay(numbers);
		usingStream(numbers);
		
	}

	private static void usingTraditionWay(List<Integer> numbers) {
		Double sum = 0d;
		Double count = 0d;
		
		for(int i=0; i < numbers.size()-1; i++) {
			if(numbers.get(i) > 0) {
				count++;
				sum=sum+numbers.get(i);
			}
		}
		System.out.println("Average is :"+ sum/count);
	}

	private static void usingStream(List<Integer> numbers) {
		System.out.println(numbers.stream()
			.filter(x -> x > 0)
			.collect(Collectors.averagingDouble(x->x))
		);
	}
	
}
//15