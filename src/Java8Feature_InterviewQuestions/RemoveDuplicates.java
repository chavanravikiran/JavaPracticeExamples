package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//To remove duplicate characters from a string while maintaining the original order, you can do it both in a normal (traditional) way and using Java 8 Streams.
public class RemoveDuplicates {

	public static void main(String[] args) {
		String word = "ravikiran";
		//Traditional Way
		usingTraditional(word);
		System.out.println();
		System.out.println("-------------------");
		
		//Using HashSet
		usingHashSet(word);
		System.out.println("-------------------");
		
		//using Stream
		usingStream(word);
	}




	private static void usingTraditional(String word) {
		Arrays.stream(word.split("")).distinct().forEach(System.out::print);
	}

	private static void usingStream(String word) {
		String newString = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);//return single charactor from string
			if (newString.indexOf(ch) == -1) {//Return Index and pass char
				newString += ch;
            }
		}
		System.out.println("Result: " +newString);
	}
	
	private static void usingHashSet(String word) {
		StringBuilder newString = new StringBuilder();
		Set<Character> seen = new HashSet<>();

		for (char ch : word.toCharArray()) {
		    if (seen.add(ch)) { // returns false if already exists
		        newString.append(ch);
		    }
		}
		System.out.println("Result: " + newString.toString());
	}
	
	
}
