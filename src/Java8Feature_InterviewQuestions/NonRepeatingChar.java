package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

//Input String str = "TEST";
//Output : ES
public class NonRepeatingChar {
	public static void main(String[] args) {
		String str = "TEST";
		
		usingTraditionalWay(str);
		usingStream(str);
	}

	private static void usingTraditionalWay(String str) {
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		for(char ob : str.toCharArray()) {
			map.put(ob, map.getOrDefault(ob, 0) + 1);
		}
	}

	private static void usingStream(String str) {
		String result = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(c ->c,LinkedHashMap::new,Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() == 1)
				.map(x->x.getKey())
				.collect(Collectors.joining(""));
		
		System.out.println(result);
	}
}
