package Java8Feature_Stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//FlatMap--To convert Multiple List to one Single List(flatend list)
public class StreamExample3_FlatMap {
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4);
		List<Integer> list2 = Arrays.asList(3,6,8);
		List<Integer> list3 = Arrays.asList(2,3,5,3,7);
		
		System.out.println(
				Stream.of(list1,list2,list3)
				.flatMap(List::stream)
				.collect(Collectors.toList())
		);
		
		//Distinct value
		System.out.println(
				Stream.of(list1,list2,list3)
				.flatMap(List::stream).distinct()
				.collect(Collectors.toList())
		);
		
		Map<String,List<Integer>> map= new LinkedHashMap<>();
		map.put("ravi", Arrays.asList(1,2,3,4,5));
		map.put("Kiran", Arrays.asList(2,2,4,6,8));
		map.put("Chavan", Arrays.asList(1,2));
		map.put("atul", Arrays.asList(2,8,9,4,5));
		
		//print all keys ussing keySet()
		System.out.println(map.keySet());
		
		//print all values 
		System.out.println(map.values());
		
		//Converting multiple List to one Single List
		System.out.println(map.values().stream().flatMap(List::stream).collect(Collectors.toList()));
	}
}
