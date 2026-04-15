package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Partition Strings by Palindrome
//List<String> words = Arrays.asList("radar", "level", "java", "stream");
//Output: {false=[java, stream], true=[radar, level]}
public class PartitionStringsByPalindrome {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("radar", "level", "java", "stream");
		
		System.out.println(words.stream()
		.collect(Collectors.partitioningBy(x->x.equals(new StringBuilder(x).reverse().toString())))
		.entrySet().stream().map(x->x.getKey()==false));
		
	}
}
