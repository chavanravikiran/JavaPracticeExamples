package StringExample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateElement {
	public static void main(String[] args) {
		String strOrg = "DhammpalRavikiran";
		String str = strOrg.toLowerCase();
//		o/p:armi

		traditionalWay1(str);
		traditionalWay2(str);
		usingStreamWay3(str);
	}

	private static void traditionalWay1(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		Integer count = 1;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
//				map.put(ch, map.get(ch + 1));
				map.put(ch, map.get(ch) + 1);
//				map.get(ch + 1);
			} 
			else {
				map.put(ch, count);
			}
		}
		
		List<Character> result = map.entrySet().stream().filter(x -> x.getValue().intValue() >= 2)
				.map(x -> x.getKey())
				.collect(Collectors.toList());
//		
//		List<Character> result = map.entrySet()
//	            .stream()
//	            .filter(x -> x.getValue() >= 2)
//	            .map(x -> x.getKey())
//	            .collect(Collectors.toList());
		System.out.println(result);

	}

	static void traditionalWay2(String str) {
		char ch;
		Integer count = 1;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count = count + 1;
					if (count > 2) {
						System.out.print(str.charAt(i) +" - "+i +" ");
						break;
					}
				}
			}
		}
	}
	
	
	private static void usingStreamWay3(String str) {
		System.out.println();
		System.out.println(
				Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(x->x,Collectors.counting()))
				.entrySet().stream()
				.filter(x->x.getValue()>=2)
				.map(x->x.getKey())
				.collect(Collectors.toList())
		
		);
	}
	
	

}
