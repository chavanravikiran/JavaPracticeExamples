package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateElementUsingStream {
		public static void main(String[] args) {
			List<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,3,4,4,2,6));
			usingStream(number);
		}

		private static void usingStream(List<Integer> number) {
			Map<Object, Long> map = number.stream()
			.collect(Collectors.groupingBy(x->x,Collectors.counting()));
					
			System.out.println(
					map.entrySet().stream()
					.filter(x->x.getValue()>1)
					.collect(Collectors.toList())
			);
		}
}
