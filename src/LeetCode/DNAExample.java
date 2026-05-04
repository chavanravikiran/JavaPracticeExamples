package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DNAExample {
	public static void main(String[] args) {
		String input = "AAAAAAAAAAA";
		Long counter = 10L;

//		System.out.println(
		list(input);
//				);
	}

	static List<String> list(String input) {
		List<String> output = new ArrayList<>();
		for (int i = 0; i < input.length() - 10; i++) {

			output.add(input.substring(i, i + 10));
		}

		System.out.println(output.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() >= 2).map(x -> x.getKey()).collect(Collectors.toList())
		);
		return null;
	}
}
