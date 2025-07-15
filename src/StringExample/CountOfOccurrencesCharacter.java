package StringExample;

import java.util.Iterator;

//Write a Java program to count the occurrences of each character in string.
public class CountOfOccurrencesCharacter {
	public static void main(String[] args) {
		String str = "I Love Java Programming";
		int count = countOccurrences(str,'o');
		System.out.println(count);
	}

	private static int countOccurrences(String str, char c) {
		String toLower = str.toLowerCase();
		int count = 0;
		for (int i = 0; i < toLower.length(); i++) {
			if(toLower.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
}
