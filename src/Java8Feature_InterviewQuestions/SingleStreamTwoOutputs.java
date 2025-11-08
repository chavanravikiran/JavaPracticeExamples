package Java8Feature_InterviewQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SingleStreamTwoOutputs {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        // One stream, two different results (sum and average)
        System.out.println(
        		numbers.stream()
                .collect(Collectors.teeing(					// Combine to Collecotors in one
                        Collectors.summingInt(x->x),
                        Collectors.averagingInt(x->x),
                        (sum, avg) -> Map.of("Sum", sum, "Average", avg)//The last lambda (sum, avg) -> … merges both results.
                )));

    }
}
