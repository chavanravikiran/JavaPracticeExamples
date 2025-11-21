package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Find First Repeaded Charectors from given string
public class FirstRepeatedCharacter {
	public static void main(String[] args) {
		String str = "Hello World";

		usingStreamWay(str);
		usingTraditionalWay(str);

	}

	private static void usingStreamWay(String str) {
		System.out.println(
				Arrays.stream(str.split(""))
				.filter(x -> str.indexOf(x) != str.lastIndexOf(x))
				.findFirst().get());

		System.out.println("Using Traditional Way ");
	}

	private static void usingTraditionalWay(String str) {
		List<String> list = new ArrayList<>();
		for (String s : str.split("")) {
			if (str.indexOf(s) != str.lastIndexOf(s)) {
				System.out.println(s);
				break;
			}
		}
	}
}
