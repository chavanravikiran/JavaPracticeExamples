package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindSecondHighestElement {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(13, 7, 16, 18, 14, 17, 18, 8, 9));

		Integer a = arr.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();

		System.out.println("Using Stream : " + a);

		int[] array = { 13, 7, 16, 18, 14, 16, 18, 8, 10 };

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : array) {

			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}

		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("Second largest element does not exist.");
		} else {
			System.out.println("Largest Element: " + largest);
			System.out.println("Second Largest Element: " + secondLargest);
		}
	}

}
