package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

// String = "I Love My India"
//Output ="I evoL yM aidnI"
public class CognizantInterviewQuestion3 {
	public static void main(String[] args) {
		String str = "I Love My India";
		
		usingTraditionalWay(str);
		usingStream(str);
	}

	private static void usingTraditionalWay(String str) {
		String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println(result.toString().trim());
	}

	private static void usingStream(String str) {
		System.out.println(
				Arrays.stream(str.split(" "))
				.map(word-> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "))
		);
	}
}
	