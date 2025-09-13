package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Square of any even no from array List
public class EventThenSquare {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,5,6);
		
		System.out.println(
				list.stream()
				.filter(x->x % 2 == 0)
				.map(y->y*y)
				.collect(Collectors.toList())
		);
	}
}

//[4, 16, 36]

