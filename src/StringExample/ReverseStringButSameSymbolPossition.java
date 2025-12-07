package StringExample;

import java.util.Iterator;

//Intput String str = "Ravi@kira&n";
//Output result = nari@kiva&R;
public class ReverseStringButSameSymbolPossition {
	public static void main(String[] args) {
		String str = "Ravi@kira&n";

        // Step 1: Take only letters and reverse them
        String letters = str.replaceAll("[^A-Za-z]", "");
        String reversedLetters = new StringBuilder(letters).reverse().toString();

        // Step 2: Re-insert special characters in same position
        StringBuilder result = new StringBuilder(str);
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                result.setCharAt(i, reversedLetters.charAt(index));
                index++;
            }
        }

        System.out.println(result.toString());
	}
}
