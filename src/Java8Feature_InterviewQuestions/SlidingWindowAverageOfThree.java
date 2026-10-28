package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SlidingWindowAverageOfThree {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,8,15,16,23,42);
		
		usingTraditionalWay(list);
		usingStreamWay(list);
		
	}

	private static void usingTraditionalWay(List<Integer> list) {
		List<Integer> result2 = new ArrayList<>();

		for (int i = 0; i < list.size() - 2; i++) {
		    result2.add((list.get(i) + list.get(i + 1) + list.get(i + 2)) / 3);
		}

		System.out.println(result2);
	}
	
	private static void usingStreamWay(List<Integer> list) {
		List<Integer> result1 = IntStream.range(0, list.size()-2)
				.map(i->(list.get(i)+list.get(i+1)+list.get(i+2)/3))
				.boxed()
				.toList();
				
		System.out.println(result1);
	}
}
