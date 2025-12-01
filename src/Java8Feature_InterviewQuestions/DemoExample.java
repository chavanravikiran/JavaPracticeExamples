package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,4,-4,3,-2,-3,6);
		
		System.out.println(list.stream().filter(x->x>=0).collect(Collectors.toList()));
		System.out.println(list.stream().map(x->x>0).collect(Collectors.toList()));
	}
}
