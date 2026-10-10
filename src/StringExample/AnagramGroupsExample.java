package StringExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroupsExample {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("listen","silent","eat", "tea", "tan", "ate", "nat", "bat");
		//Create Map
		Map<String,List<String>> map = new HashMap<>();
		
		//Iterate List
		for(String str : list) {
			//Convert String word to Char [] array
			char[] ch = str.toCharArray();
			//Sort Char [] array
			Arrays.sort(ch);
			//then again convert char[] to String 
			String word = new String(ch);

			//first check already present if not present then add key
			if(!map.containsKey(word)) {
				map.put(word, new ArrayList<>());
			}
			//if key already present then add word in array
			map.get(word).add(word);
		}
		
		System.out.println(map);
	}
	
}
