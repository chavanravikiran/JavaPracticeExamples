package Collection_LinkedList;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Find First Non-Repeating Character in a String- Write a method to return the first non-repeating character in a string (Use LinkedHasMap)
public class FirstNonRepeatingCharacter {
	public static void main(String args[]){
		String strObj = "Ravkiran";
		String str =strObj.toLowerCase();
		
		System.out.println(Arrays.stream(str.split(""))
			.filter(x->str.indexOf(x) != x.strip().lastIndexOf(x))
			.collect(Collectors.groupingBy(x->x,Collectors.counting()))
			.entrySet().stream()
			.filter(x->x.getValue() == 1)
			.limit(1)
			.collect(Collectors.toList())
		);
		
		Map<Character, Integer> charCountMap = new LinkedHashMap<>();
		for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
		System.out.println(
				charCountMap.entrySet().stream()
				.filter(x->x.getValue()==1)
				.map(Map.Entry::getKey)
				.findFirst().get()
			);
		
	}
}
