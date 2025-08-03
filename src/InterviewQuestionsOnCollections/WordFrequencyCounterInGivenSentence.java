package InterviewQuestionsOnCollections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyCounterInGivenSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Original String");
		String string=sc.nextLine();//nextLine() -Take Line From Uses ,next()--OnlyTake Single Word

		wordCountInPara(string.toLowerCase());	
		
		withStream(string.toLowerCase());
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

	private static void withStream(String lowerCase) {
		String[] list =lowerCase.split(" ");

		Map<String, Long> wordFrequency = Arrays.stream(list)
                .collect(Collectors.groupingBy(x->x, Collectors.counting()));
		
		System.out.println("Count of Characters in a given string : " + wordFrequency);
	}
}
