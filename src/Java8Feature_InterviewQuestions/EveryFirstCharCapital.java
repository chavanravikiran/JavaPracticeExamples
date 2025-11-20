package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

//input:"Cacheable stores data in the cache implementation you choose such as"
//output:"Cacheable Stores Data In The Cache Implementation You Choose Such As"
public class EveryFirstCharCapital {

	public static void main(String[] args) {
		String input = "Cacheable stores data in the cache implementation you choose such as";
		
		System.out.println(Arrays.stream(input.split(" "))
		.map(x->x.substring(0,1).toUpperCase().concat(x.substring(1)))
		.collect(Collectors.joining(" ")));
	}
}
