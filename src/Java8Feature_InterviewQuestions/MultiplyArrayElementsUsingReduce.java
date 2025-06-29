package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Using Reduce to return single result from multple stream element
//like that to -sum ,product,maximum,concatinate
public class MultiplyArrayElementsUsingReduce {
		public static void main(String[] args) {
			List<Integer> numbers = Arrays.asList(1,2,3,4,5);
			
			//sum
			Optional<Integer> sum = numbers.stream()
			.reduce((x,y)->(x+y));
			
			System.out.println(sum.get());
			
			//Product
			Optional<Integer> product = numbers.stream()
					.reduce((x,y)->(x*y));
			
			System.out.println(product.get());
			
			//maximum
			Optional<Integer> max = numbers.stream()
		            .reduce((x, y) -> x > y ? x : y);
		        System.out.println("Maximum: " + max.get());
			
			//Concatinate
	        Optional<String> concatenated = numbers.stream()
	                .map(String::valueOf)
	                .reduce((x, y) -> x + y);
	            System.out.println("Concatenated: " + concatenated.get());	
		}
		
}
