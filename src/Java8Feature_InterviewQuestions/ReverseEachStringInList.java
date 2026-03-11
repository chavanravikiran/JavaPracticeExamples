package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Reverse Each String in a List
//List<String> words = Arrays.asList("Java", "Stream", "API");
//Output: [avaJ, maertS, IPA]
public class ReverseEachStringInList {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Stream", "API");

		usingStream(words);
		usingTraditionalWay(words);
	}


	private static void usingStream(List<String> words) {
		List<String> reverse = 
				words.stream()
				.map(x -> new StringBuilder(x).reverse().toString())
				.collect(Collectors.toList());

		System.out.println(reverse);
	}
	
	private static void usingTraditionalWay(List<String> words) {
		List<String> rev = new ArrayList<>();
		String temp = null;
		for (String str : words) {
			for (int i = str.length()-1; i >= 0; i--) {
				temp+=str.charAt(i);
//				System.out.println(str.charAt(i));
			}
			rev.add(temp);
			System.out.println(temp);
		}
//		System.out.println(rev);
	}
	
}
