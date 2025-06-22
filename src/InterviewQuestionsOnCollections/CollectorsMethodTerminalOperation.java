package InterviewQuestionsOnCollections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;import java.util.stream.Collector;
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
		
		//toMap but duplicate key
		//to Work with how to avoid collison while working with map
		Map<Integer,String> toMap1= list.stream()
				.collect(Collectors.toMap(x->x.length(), x->x,(oldValue,newValue)->oldValue +" : "+newValue));
		System.out.println(toMap1);
		
		//groupingBy
		
		
		//count from stream class and counting from Collectors class
		Long count=list.stream().count();
		Long counting=list.stream().collect(Collectors.counting());
		System.out.println("Count using stream class : "+count +" Counting from Collectors class : "+counting);
		
		
		//Joining
		System.out.println(list.stream().collect(Collectors.joining(",")));
		System.out.println(list.stream().collect(Collectors.joining(",", "!", "@")));
	}
}
