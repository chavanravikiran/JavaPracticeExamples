package InterviewQuestionsOnCollections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsMethodTerminalOperation {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten","elevent","twenty");
		
		//toList
		List<String> toList= list.stream()
				.filter(x->x.length() >3)
				.collect(Collectors.toList());
		System.out.println(toList);
		
		//toSet
		Set<String> toSet=list.stream()
				.filter(x -> x.length() > 4 && x.startsWith("t"))
				.collect(Collectors.toSet());
		System.out.println(toSet);
		
		//toMap
		Map<String,Integer> toMap= list.stream()
				.filter(x ->x.startsWith("t"))
				.collect(Collectors.toMap(x->x, x->x.length()));
		System.out.println(toMap);
		
		//groupingBy
		
	}
}
