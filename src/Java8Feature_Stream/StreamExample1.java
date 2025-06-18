package Java8Feature_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {

	public static void main(String[] args) {
		List<String> techStack = Arrays.asList("Java","Spring Boot","Spring MVC","Spring AOP","Angular","Postgresql","Oracle");
		
		List<String> result1 = techStack.stream()
		.filter(x ->x.length()>6)//Use Predicates
		.collect(Collectors.toList());
		System.out.println("result1"+result1);
		
		//Operation
		Long count=techStack.stream().count();
		System.out.println("count "+count);
		
		//distinct() and start with Spring-use filter for predicates 
		List<String >distinctListStartWithS = techStack.stream()
		.filter(x -> x.startsWith("Spring"))
		.distinct()
		.collect(Collectors.toList());
		System.out.println("distinctListStartWithS :-"+distinctListStartWithS);
		
		//map for function() interface
		//All values to convert to uppercase
		List<String> toUpperCase= techStack.stream()
				.map(x ->x.toUpperCase())
				.collect(Collectors.toList());
		System.out.println("toUpperCase :- "+toUpperCase);
		
		List<String> filterAndMap = techStack.stream()
				.filter(x -> x.length()<5)
				.map(x -> x.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println("filterAndMap "+filterAndMap);
	}
}
