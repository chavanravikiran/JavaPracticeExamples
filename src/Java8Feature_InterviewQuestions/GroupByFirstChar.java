package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Group list of strings by their first character and count the number of strings
public class GroupByFirstChar {
	public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "blueberry", "cherry", "avocado");
        
        System.out.println(words.stream()
//        .map(x->x)
        .collect(Collectors.groupingBy(x->x.charAt(0),Collectors.counting())));
	}
}
