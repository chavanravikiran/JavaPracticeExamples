package Java8Feature_InterviewQuestions;

import java.util.stream.IntStream;


//Palindrome Example
public class PalindromeStreamEasy {
	public static void main(String[] args) {
		String input = "madam";
		
		usingTraditionalWay(input);
		
		usingStream(input);
	}

	private static void usingTraditionalWay(String input) {
		String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }		
	}

	private static void usingStream(String input) {
		boolean isPalindrome = IntStream.range(0, input.length() / 2)
	            .allMatch(i -> input.charAt(i) == input.charAt(input.length() - 1 - i));

	        System.out.println(isPalindrome ? "Palindrome" : "Not a palindrome");		
	}
}
