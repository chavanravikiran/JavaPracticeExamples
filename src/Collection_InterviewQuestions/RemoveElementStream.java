package Collection_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElementStream {
	public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 3};

        List<Integer> result = Arrays.stream(arr)
                .filter(x -> x != 3)
                .collect(Collectors.toList());

        System.out.println(result); // Output: [1, 2, 4, 5]	
	}
}
