package Java8Feature_InterviewQuestions;

import java.util.Arrays;

//Find First Repeaded Charectors from given string
public class FirstRepeatedCharacter {
	public static void main(String[] args) {
		String str="Hello World";
		
		System.out.println(Arrays.stream(str.split(""))
		.filter(x->str.indexOf(x) != str.lastIndexOf(x))
		.findFirst().get());
	}
}
