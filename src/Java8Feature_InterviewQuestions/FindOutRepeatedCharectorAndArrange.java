package Java8Feature_InterviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

//aaabbbcccc a3b3c4 ha output 
public class FindOutRepeatedCharectorAndArrange {
	public static void main(String[] args) {
		String str = "aaabbbcccc";
		
		
		String result = str.chars()  // convert to IntStream
	            .mapToObj(c -> String.valueOf((char) c)) // convert to Stream<String>
	            .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting())) // preserve order
	            .entrySet().stream()
	            .map(e -> e.getKey() + e.getValue()) // combine key and count
	            .collect(Collectors.joining());
			
		System.out.println("Using Stream - "+result);
		
		String collection = usingCollection(str);
		System.out.println("Using Collection - "+collection);
	}
	
	static String usingCollection(String str) {
		
		 Map<Character, Integer> map = new LinkedHashMap<>();
	        for (char c : str.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }

	        String results = "";
	        for (Entry<Character, Integer> item : map.entrySet()) {
	        	 results = results + item.getKey() + item.getValue();
	        }
	        
	        return results;
	}
}
