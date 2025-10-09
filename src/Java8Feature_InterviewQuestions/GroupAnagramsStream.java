package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagramsStream {
	public static void main(String[] args) {
		String[] words = {"eat","tea","tan","ate","nat","bat"};
		
		 // Group words that are anagrams of each other
        		System.out.println(
        			Arrays.stream(words)
	                .collect(Collectors.groupingBy(word -> {
	                    char[] arr = word.toCharArray();  // convert word to char array
	                    Arrays.sort(arr);                 // sort characters (e.g., "eat" -> "aet")
	                    return new String(arr);			  // use sorted word as key
	                })).values()
                );
	}
}
