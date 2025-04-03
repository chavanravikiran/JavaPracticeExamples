package BeginnerExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FindLongestWordIinSentence {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Original String");
		String string=sc.nextLine(); //nextLine() -Take Line From Uses ,next()--OnlyTake Single Word

		findLongestWord(string);
	}

	
	private static void findLongestWord(String string) {
		HashMap<String, Integer> map = new HashMap<>();
		String[] afterSplit = string.split(" ");
		for (String word : afterSplit) {
			map.put(word, word.length());
		}
		
		Set<Entry<String, Integer>> set =map.entrySet();
		
		String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        
        for (Entry<String, Integer> entry : set) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        
        System.out.println("max key -->"+maxKey + " : "+ maxValue);
//		System.out.println(map.values());
		
	}
}
