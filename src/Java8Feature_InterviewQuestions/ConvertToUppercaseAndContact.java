package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//Convert to uppercase and concat
public class ConvertToUppercaseAndContact {
	public static void main(String[] args) {		
		List<String> str = Arrays.asList("a","b","c","d","e","f");
		
		Optional<String> result=str.stream()
				.reduce((x,y)->(x+" "+y).toUpperCase());
		System.out.println(result.get());
	
	}
}
