package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ParttitioningRxample {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
		
		System.out.println(list.stream()
			.collect(Collectors.partitioningBy(x->x % 2 == 0))
			.entrySet().stream()
			.collect(Collectors.toMap(x->x.getKey() == false ? "odd" : "even", y->y.getValue()))
		);
	}
}