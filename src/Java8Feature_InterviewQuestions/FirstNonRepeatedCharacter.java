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
		
		char result = firstNonRepeatedCharacter(word);
        System.out.println(result);
	}
	
	public static char firstNonRepeatedCharacter(String word) {
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (word.indexOf(currentChar) == word.lastIndexOf(currentChar)) {
                return currentChar;
            }
        }
        return '\0';  // No non-repeated character
    }
}
