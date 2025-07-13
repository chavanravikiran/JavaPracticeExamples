package StringExample;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class VowelsCount {
	public static void main(String[] args) {
		String str = "Find Out Vowels Count From String";
		
		int count = usingTraditionWay(str);
		System.out.println("Count Of Vowels using Traditional Way :"+count);
		
		Map<String,Integer> map= usingStream(str);
		System.out.println(map);
	}


	private static int usingTraditionWay(String str) {
		int count = 0;
		for(int i = 0; i < str.length()-1; i++){
			Character ch = str.charAt(i);
			if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' || 
			   ch == 'A' || ch == 'I' || ch == 'E' || ch == 'O' || ch == 'U') {
				count ++;
			}
		}
		return count;
	}

	private static Map<String, Integer> usingStream(String str) {
		 return str.chars()
	              .mapToObj(c -> String.valueOf((char) c)) // Convert char to lowercase string
	              .filter(ch -> "aeiouAEIOU".contains(ch))                    // Keep only vowels
	              .collect(Collectors.groupingBy(                        // Group by vowel
	                       ch -> ch,
	                       Collectors.summingInt(ch -> 1)                // Count each vowel
	              ));
	}
}
