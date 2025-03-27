package BeginnerExample;

import java.util.HashMap;
import java.util.Scanner;

public class WordCountInParagraph {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Original String");
		String string=sc.nextLine();//nextLine() -Take Line From Uses ,next()--OnlyTake Single Word

		wordCountInPara(string);		
	}

	private static void wordCountInPara(String string) {
		String [] words = string.split(" ");
		HashMap<String,Integer> charCountMap = new HashMap<>(); 
		
		for (String string2 : words) {
			if(charCountMap.containsKey(string2)) {
				charCountMap.put(string2, charCountMap.get(string2)+1);
			}else {
				charCountMap.put(string2,1);
			}
		}
		System.out.println("Count of Characters in a given string : " + charCountMap);
		
	}
}
