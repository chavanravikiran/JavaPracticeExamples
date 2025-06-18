package Java8Feature_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> square=number.stream()
			.map(x -> x * x )
			.collect(Collectors.toList());
		
		System.out.println("square :- "+square);
		
		//print one by one and iterate 
		number.stream().forEach(x->System.out.println(x));
		
		
		
	}
}
