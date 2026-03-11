package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//Find the Most Frequent Character in a String
//Question: Find the most frequent character in a string.
//Output: s
public class FindTheMostFrequentCharacterInString {
	public static void main(String[] args) {
		String input = "success";
		
		Map<Object, Long> map = Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
		System.out.println(map.entrySet().stream()
				.sorted((x, y) -> Long.compare(y.getValue(), x.getValue()))
                .map(e -> e.getKey())
                .findFirst()
                .get()
         );
	}
}
