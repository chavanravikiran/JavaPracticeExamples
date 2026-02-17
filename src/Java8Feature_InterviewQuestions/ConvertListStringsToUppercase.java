package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert List of Strings to Uppercase
public class ConvertListStringsToUppercase {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("java", "stream", "api");
		
		usingStream(names);
		usingTraditionalWay(names);
	}

	private static void usingStream(List<String> names) {
		System.out.println(
				names.stream()
			.map(x->x.toUpperCase())
			.collect(Collectors.toList())
		);
	}

	private static void usingTraditionalWay(List<String> names) {
		List<String> obj = new ArrayList<>();
		for (String name : names) {
			obj.add(name.toUpperCase());
		}
		for (String ab : obj) {
			System.out.println(ab);
		}
	}
}
