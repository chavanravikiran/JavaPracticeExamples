package ArrayExample;

import java.util.Arrays;

public class SecondLargestNo {
	public static void main(String[] args) {
		int array[] = {10,5,20,49,45,58};
		System.out.println("Original Array : "+Arrays.toString(array));
		
		int largeNo=findSecondLargestNo(array);
		System.out.println("Second Larget No is "+largeNo);
	}

	private static int findSecondLargestNo(int[] array) {
		for(int i = 0; i<array.length-1 ; i++) {
			for(int j =i+1; j<array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[array.length-2];
	}
}
