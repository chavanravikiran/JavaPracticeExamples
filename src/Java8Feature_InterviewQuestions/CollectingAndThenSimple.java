package Java8Feature_InterviewQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class CollectingAndThenSimple {
	public static void main(String[] args) {
        List<String> names = List.of("Ravi", "Kiran", "Chavan");

        String result = names.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.joining(", "),      // Step 1: Join all names
                        x->x.toUpperCase()            // Step 2: Convert to uppercase
                ));

        System.out.println(result);
    }
}
