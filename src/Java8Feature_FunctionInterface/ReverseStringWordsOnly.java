package Java8Feature_FunctionInterface;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseStringWordsOnly {
	public static void main(String[] args) {
		String sentence = "We need to reverse words only from sentence";
		
		String str = Arrays.stream(sentence.split(" "))
		.map(x-> new StringBuilder(x).reverse().toString())
		.collect(Collectors.joining(" "));
		
		System.out.println(str);
	}
}
