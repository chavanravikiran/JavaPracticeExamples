package Java8Feature_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample4_Reduce {
	
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,3,4,5);
		
		//Addition
		Optional<Integer> sum = number.stream()
		.reduce((x , y) -> (x + y));
		
		if(sum.isPresent()) {
			System.out.println("sum :- "+sum.get());
		}else {
			System.out.println("Value is not Present !!! ");
		}
		
		//Multiplication
		Optional<Integer> multi = number.stream()
				.reduce((x , y) -> (x * y));

		if(multi.isPresent()) {
			System.out.println("sum :- "+multi.get());
		}else {
			System.out.println("Value is not Present !!! ");
		}
		
		//Substraction
		Optional<Integer> sub = number.stream()
				.reduce((x , y) -> (x - y));

		if(multi.isPresent()) {
			System.out.println("sum :- "+sub.get());
		}else {
			System.out.println("Value is not Present !!! ");
		}
		
	}
}
