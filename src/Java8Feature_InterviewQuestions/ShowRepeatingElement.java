package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ShowRepeatingElement {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,6,2,5,1);
		
		Map<Integer,Long> grouping = list.stream()
		.collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
		System.out.println(grouping);
		List<Entry<Integer, Long>>duplicateElement = grouping.entrySet().stream()
		.filter(x->x.getValue()>=2)
		.collect(Collectors.toList());
		
		System.out.println(duplicateElement);
	}
}
