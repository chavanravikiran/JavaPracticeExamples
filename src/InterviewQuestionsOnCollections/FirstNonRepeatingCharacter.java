package InterviewQuestionsOnCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Find First Non-Repeating Character in a String using HashMap 
public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String word=sc.next();
		
		System.out.println(findFirstNonRepitingChar(word));
		
	}

	private static char findFirstNonRepitingChar(String word) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(char ch : word.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
			//Another Way using getOrDefault()
			//map.put(ch, map.getOrDefault(ch, 0)+1);
			//getOrDefault(ch, 0) ensures that new characters start with a count of 0.
			//put(ch, count + 1) updates the count in a concise way.
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
		return 0;
	}
}
