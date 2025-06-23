package InterviewQuestionsOnCollections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharFrequency {

	public static void main(String[] args) {
		String input="Ravikiran";
		
		Map<Character, Integer> freqMap = usingTradionalWay(input);
		System.out.println("Using traditional way "+freqMap);
		
		Map<String, Long> usingStream = usingStream(input);
		System.out.println("Using usingStream way "+usingStream);
        
	}


	private static Map<Character, Integer> usingTradionalWay(String input) {
		Map<Character, Integer> freqMap = new HashMap<>();
        
        for (char ch : input.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        return freqMap;
	}

	private static Map<String, Long> usingStream(String input) {
		return Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
	}
}
