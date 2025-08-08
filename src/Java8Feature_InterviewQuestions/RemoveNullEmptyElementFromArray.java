package Java8Feature_InterviewQuestions;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class RemoveNullEmptyElementFromArray {
	public static void main(String[] args) {
		String[] input = {"java", "", " ", null, "spring", "Ruby"};
		
		List<String> cleaned = Arrays.stream(input)
				.filter(s -> s != null && !s.trim().isEmpty())
				.collect(Collectors.toList());
		
		System.out.println(cleaned);  // Output: [java, spring, Ruby]
	}

}
