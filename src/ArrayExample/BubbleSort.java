package ArrayExample;

import java.util.Arrays;

//Bubble Sort And find out Min and Max Element
public class BubbleSort {
	public static void main(String[] args) {
		int [] arr = {-3,3,7,2,8};
		System.out.println("Original Array :"+Arrays.toString(arr));
		
		int []sorted =bubbleSort(arr);
		System.out.println("Bubble Soted Array :"+Arrays.toString(sorted));
		
		//find out Min and Max
		System.out.println("Min Element from Array :"+sorted[0]);
		System.out.println("max Element from Array :"+sorted[sorted.length-1]);
		
	}

	private static int[] bubbleSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
