package Java8Feature_InterviewQuestions;

import java.util.Arrays;
//Find First Non Repeated Character
public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
//		String word = "swiss";
		String word = "Hello World";
		System.out.println(
				Arrays.stream(word.split(""))
				.filter(x->word.indexOf(x) == word.lastIndexOf(x))
				.findFirst().get()
		);
	}
}
