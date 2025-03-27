package InterviewQuestionsOnCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

//Find Duplicate Elements in an Array using HashSet
public class FindDuplicateElementUsingHashSet {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the number of elements: ");
	        int size = scanner.nextInt();

	        // Step 2: Declare the array
	        int[] numbers = new int[size];

	        // Step 3: Input elements
	        System.out.println("Enter " + size + " numbers:");
	        for (int i = 0; i < size; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        // Step 4: Display the array
	        System.out.print("You entered: ");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	        scanner.close();
	        System.out.println();

	        fndDuplicateElement(numbers);	
	}

	private static void fndDuplicateElement(int[] numbers) {
		HashSet<Integer> duplicateEle = new HashSet<>();
		
		for (int i : numbers) {
			if(!duplicateEle.isEmpty() && duplicateEle.contains(i)) {
				System.out.println("Duplicate Element is like that "+i);
				
			}else {
				duplicateEle.add(i);
			}
		}
		
	}

	

	
}
