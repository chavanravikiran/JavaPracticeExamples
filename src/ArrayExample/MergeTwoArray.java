package ArrayExample;

import java.util.Arrays;

public class MergeTwoArray {
	public static void main(String[] args) {
		int[] arr1 = {1,2,5,7,9};
		int[] arr2 = {3,-9,7,3,5,8};
		System.out.println("original array:-"+Arrays.toString(arr1));
		System.out.println("original array:-"+Arrays.toString(arr2));
		
		//without inbuilt method
		mergeArray(arr1,arr2);
		
		//with inbuilt method
		int[] mergedArray = mergeArrays(arr1, arr2);
		System.out.println("Merged array: " + Arrays.toString(mergedArray));
	}


	private static void mergeArray(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length + arr2.length];
		// Copy elements from arr1 to arr3
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        // Copy elements from arr2 to arr3
        for (int j = 0; j < arr2.length; j++) {
            arr3[arr1.length + j] = arr2[j]; // Start inserting at arr1.length
        }
		System.out.println("merge array:-"+Arrays.toString(arr3));
	}

	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		int[] mergedArray = Arrays.copyOf(arr1, arr1.length + arr2.length);
		// Copy second array elements
		System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
		return mergedArray;
	}
	
}
