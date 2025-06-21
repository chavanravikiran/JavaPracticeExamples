package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Optional;

//Question:-Java finds the longest word easily using streams or normal way
public class LongestWordFinder {

	public static void main(String[] args) {
		String sentence = "Java finds the longest word easily using streams or normal way";
		
		//Old Techniques
		String oldTechniques=usingOldTechnique(sentence);
		System.out.println(oldTechniques);
		
		//New Techniques -using Stream
		String newTechniques=usingNewTechnique(sentence);
		System.out.println(newTechniques);
	}

	private static String usingOldTechnique(String sentence) {
		String longestWord ="";
		String[] words = sentence.split(" ");
		for (String word : words) {
			if(word.length() >longestWord.length()) {
				longestWord=word;
			}
		}
		return "longest Word is '"+longestWord +"' and lenght of this word is "+longestWord.length();
	}

	private static String usingNewTechnique(String sentence) {
		Optional<String> longestWord = Arrays.stream(sentence.split(" "))
				.max((x,y) -> Integer.compare(x.length(), y.length()));
		
		return "longest Word is '"+longestWord.get() +"' and lenght of this word is "+longestWord.get().length();
	}
}
