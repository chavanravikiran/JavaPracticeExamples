package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramGroupsStream {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("listen","silent","eat", "tea", "tan", "ate", "nat", "bat");
		
		List<List<String>> groups = groupAnagrams(words);
		System.out.println(groups); 
		
		groupAnagrams1(words);
		
		List<List<String>> traditionWay = groupAnagramsTraditionWay(words);
        System.out.println(traditionWay);
	}

	


	public static List<List<String>> groupAnagrams(List<String> words) {
        return new ArrayList<>(
            words.stream()
                 .collect(Collectors.groupingBy(
                     w -> w.chars()
                           .sorted()
                           .mapToObj(c -> String.valueOf((char)c))
                           .collect(Collectors.joining())
                 ))
                 .values()
        );
    }

	private static void groupAnagrams1(List<String> words) {
		System.out.println(
				words.stream()
		        .collect(Collectors.groupingBy(
		                word -> {
		                    char[] arr = word.toCharArray();
		                    Arrays.sort(arr);        // sorted characters = key
		                    return new String(arr);  // anagram signature
		                }
		        )).values()
		 );
	}

	public static List<List<String>> groupAnagramsTraditionWay(List<String> words) {
	        // Map to hold sorted word as key and list of anagrams as value
	        Map<String, List<String>> map = new HashMap<>();

	        // Loop through each word
	        for (String word : words) {
	            // Convert word to character array and sort it
	            char[] chars = word.toCharArray();
	            Arrays.sort(chars);

	            // Create a string from sorted characters
	            String key = new String(chars);

	            // Check if key exists in map, if not add new list
	            if (!map.containsKey(key)) {
	                map.put(key, new ArrayList<>());
	            }

	            // Add the word to the list for this key
	            map.get(key).add(word);
	        }

	        // Return all grouped anagrams as a list of lists
	        return new ArrayList<>(map.values());
	    }
}