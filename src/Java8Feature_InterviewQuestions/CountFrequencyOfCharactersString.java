package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Count Frequency of Characters in a String 
//String input = "success";
public class CountFrequencyOfCharactersString {
	public static void main(String[] args) {
		String input = "success";

		usingStream(input);
		usingTraditional(input);
	}

	private static void usingStream(String input) {
		Map<String, Long> obj = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println("Time Complexity is O(n) " + obj);

	}

	private static void usingTraditional(String input) {
		Map<String, Long> map = new LinkedHashMap<>();
		List<String> obj = Arrays.stream(input.split("")).collect(Collectors.toList());

		for (char ch : input.toCharArray()) {
			String str = String.valueOf(ch);
			map.put(str, map.getOrDefault(str, 0L) + 1);
		}
		System.out.println(map);
	}
}
