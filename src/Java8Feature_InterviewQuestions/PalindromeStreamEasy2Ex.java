package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeStreamEasy2Ex {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("madam", "cat", "racecar", "java", "level", "world");
		List<String> palindromes = words.stream()
									.filter(PalindromeStreamEasy2Ex::isPalindrome)
									.collect(Collectors.toList());
		System.out.println("Palindromes: " + palindromes);
	}

	private static boolean isPalindrome(String str) {
		String reversed = new StringBuilder(str).reverse().toString();
		return str.equalsIgnoreCase(reversed);
	}
}
