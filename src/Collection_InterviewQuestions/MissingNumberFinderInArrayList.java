package Collection_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//How do you identify a missing integer in an array of 1 to 100?
public class MissingNumberFinderInArrayList {
	public static void main(String[] args) {
		int[] numbers = new int[99]; // Array from 1 to 100 with one number missing

		// Example: number 57 is missing
		Integer missing = 57;
		Integer index = 0;
		Integer actualSum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i != missing) {
				numbers[index++] = i;
				actualSum += i;
			}
		}
		Integer expectedSum = 100 * (100 + 1) / 2;

		List<Integer> intList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
		
		usingCollection(intList,actualSum,expectedSum);
		usingStream(intList,actualSum,expectedSum);

	}

	private static void usingCollection(List<Integer> intList,Integer actualSum,Integer expectedSum) {
		Integer missingNumber = expectedSum - actualSum;
		System.out.println("Missing number is: " + missingNumber);
	}

	private static void usingStream(List<Integer> intList, int actualSum, Integer expectedSum) {
	    Integer streamSum = intList.stream()
                       .mapToInt(Integer::intValue)
                       .sum();
	    Integer usingReduce = intList.stream()
	    		.reduce(0, Integer::sum);
//	    		 .reduce(0, (a, b) -> a + b);

	    System.out.println("Missing number (using stream): " + (expectedSum - streamSum));
	    System.out.println("Missing number (using stream): " + (expectedSum - usingReduce));
	}

}
