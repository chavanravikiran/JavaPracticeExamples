package Java8Feature_FunctionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CombinePredicateAndFunctionEx {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Ravi","Ravikiran","Kiran","Atul");
		
		System.out.println("---------------------Predicate-------------");
		Predicate<String> startsWithRavi = x -> x.startsWith("Ra");
		for (String name : names) {
			System.out.println(name+"-"+startsWithRavi.test(name));
		}
		
		System.out.println("---------------------Function-------------");
		Function<String, Integer> toLength= str -> str.length();
		for (String name : names) {
			System.out.println(name+"-"+toLength.apply(name));
		}
		
		
		System.out.println("--------Combination of Predicates and Function-----------");
		List<Integer> result = names.stream()
						.filter(startsWithRavi)
						.map(toLength)
						.collect(Collectors.toList());
		
		System.out.println(result);
		}
}
