package Java8Feature_InterviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class AnagramGroupsStream {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("listen","silent","eat", "tea", "tan", "ate", "nat", "bat");
		List<List<String>> groups = groupAnagrams(words);
		System.out.println(groups); 
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

}