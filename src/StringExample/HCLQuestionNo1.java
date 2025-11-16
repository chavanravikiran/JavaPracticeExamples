package StringExample;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//Input test
//Output ttes
//Input ball
//Output llab
public class HCLQuestionNo1 {
	public static void main(String[] args) {
		String input = "test";
		
		Map<String, Long> freq =  Arrays.stream(input.split(""))
                        .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        // duplicates (count > 1)
        String duplicates = freq.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .sorted(Map.Entry.comparingByKey())
                .map(e -> e.getKey().repeat(e.getValue().intValue()))
                .collect(Collectors.joining());

        // singles (count == 1)
        String singles = freq.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .sorted(Map.Entry.comparingByKey())
                .map(Map.Entry::getKey)
                .collect(Collectors.joining());

        String result = duplicates + singles;
		System.out.println(result);
	
	}
}
