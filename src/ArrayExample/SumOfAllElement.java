package ArrayExample;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfAllElement {
	public static void main(String[] args) {
		int array[] = {10,5,20,49,45,58};
		System.out.println("Original Array : "+Arrays.toString(array));
	
		int sumOfAllElement = sumOfAllElement(array);
		System.out.println("Sum of All Element "+sumOfAllElement);
		
		usingStream(array);
	}

	private static int sumOfAllElement(int[] array) {
		int a=0;
		for(int i=0; i<array.length; i++) {
			a += array[i];
		}
		return a;
	}

	private static void usingStream(int[] array) {
		System.out.println(Arrays.stream(array).boxed().reduce(0,(x,y)->(x+y)));
		System.out.println(Arrays.stream(array).sum());
		System.out.println(Arrays.stream(array).summaryStatistics().getSum());
	}
}
