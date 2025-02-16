package ArrayExample;

import java.util.Arrays;

public class StringLengthArray {
	public static void main(String[] args) {
		String[] array = {"RAVI", "KIRAN", "ATUL", "CHAVAN"};
		System.out.println("Original Array "+Arrays.asList(array));
		
		int intArray[] = new int[array.length];
		
		for(int i=0; i<array.length; i++) {
			intArray[i] = array[i].length();
		}
		System.out.println("Original Array "+Arrays.toString(intArray));
		
	}
}
