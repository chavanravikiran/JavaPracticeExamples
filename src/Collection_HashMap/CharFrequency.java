package Collection_HashMap;

import java.util.HashMap;
import java.util.Map;

//Write a program to count the frequency of characters in a string using Map.
public class CharFrequency {
	public static void main(String[] args) {
		
		String input="Ravikiran";
		
		Map<Character, Integer> freqMap = new HashMap<>();
        
        for (char ch : input.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        
        System.out.println(freqMap);
	}
}
