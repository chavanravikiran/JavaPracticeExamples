package BeginnerExample;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacterCount {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Original String");
		String string=sc.nextLine();//nextLine() -Take Line From Uses ,next()--OnlyTake Single Word

		duplicateCharacterCount(string);		
	}

	private static void duplicateCharacterCount(String string) {
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		
		char [] strArray =string.toCharArray();
		for (char c : strArray) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1); 
			}else { 
				charCountMap.put(c, 1); 
			} 
		}
		System.out.println("Duplicate Characters in : " + charCountMap); 
		
		Set<Character> charsInString = charCountMap.keySet();
		System.out.println("charsInString"+charsInString);
		
		for (Character ch : charsInString) { 
			if (charCountMap.get(ch) > 1) { 
				System.out.println(ch + " : " + charCountMap.get(ch)); 
			} 
		} 
	}
}
