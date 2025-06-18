package Java8Feature_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample5_Limit {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,9,1,3,4,5,55,56,3,34,234);
		
		System.out.println(number.stream()
//		.sorted(Comparator.reverseOrder())//Decendingding Order
		.sorted((a,b)->(b-a))//Decendingding Order
		.collect(Collectors.toList()));

		
		System.out.println(number.stream()
				.sorted()//Ascending Order
				.sorted((a,b)->(a-b))//Ascending Order
				.collect(Collectors.toList()));
	}
}
