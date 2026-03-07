package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Find All Palindromic Strings
//List<String> words = Arrays.asList("radar", "level", "world", "java");
//Output: [radar, level]
public class FindAllPalindromicStrings {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("radar", "level", "world", "java");
		
		way1(words);
	}


	private static void way1(List<String> words) {
		String temp = null;
		
		List<String> output = new ArrayList<>();
		for(String str : words) {
			temp= str;
			if(temp.equals(new StringBuilder(str).reverse().toString())) {
				output.add(str);
			}
		}
		System.out.println(output);
	}
}
