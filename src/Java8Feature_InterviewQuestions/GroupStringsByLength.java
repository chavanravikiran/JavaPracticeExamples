package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group Strings by Length
public class GroupStringsByLength {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Stream", "API", "Code", "Fun");
		
		usingStream(words);
		usingTraditional(words);
	}

	private static void usingTraditional(List<String> words) {
		Map<Integer,String> map = new LinkedHashMap<>();
		for (String word : words) {
//			if(!map.containsKey(word.length())) {
				map.getOrDefault(map.get(0), word);
//			}
		}
		System.out.println(map);
	}

	private static void usingStream(List<String> words) {
		System.out.println(
				words.stream()
				.collect(Collectors.groupingBy(x->x.length(),Collectors.toList()))
//				.values()  //this or below this
					.entrySet().stream()
					.map(x->x.getValue())
					.collect(Collectors.toList())
		);		
	}
}

//[Java,Code],[Stream],[API,Fun]