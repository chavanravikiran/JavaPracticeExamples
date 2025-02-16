package ArrayExample;

import java.util.Arrays;

public class SumOfAllElement {
	public static void main(String[] args) {
		int array[] = {10,5,20,49,45,58};
		System.out.println("Original Array : "+Arrays.toString(array));
	
		int sumOfAllElement = sumOfAllElement(array);
		System.out.println("Sum of All Element "+sumOfAllElement);
	}

	private static int sumOfAllElement(int[] array) {
		int a=0;
		for(int i=0; i<array.length; i++) {
			a += array[i];
		}
		return a;
	}
}
