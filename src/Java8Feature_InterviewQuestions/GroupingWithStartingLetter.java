package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Problem:Group words by their starting letter and print them (using Method References).
//Input [apple, banna, cherry, apricot, avocado,blueberry]
//Output:
//a-> apple, apricot, avocado
//b-> banna, blueberry
//c-> cherry
public class GroupingWithStartingLetter {
	public static void main(String[] args) {
		List<String> lists = Arrays.asList("apple", "banna", "cherry", "apricot", "avocado","blueberry");
		
		System.out.println(lists.stream()
		.collect(Collectors.groupingBy(x->x.charAt(0))));
	}
}

//{a=[apple, apricot, avocado], b=[banna, blueberry], c=[cherry]}
