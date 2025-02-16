package ArrayExample;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));
       
        int[] newArray =reverseArrayUsingForLoop(arr);
        System.out.println("Reversed using For loop Array: " + Arrays.toString(newArray));
    }


	private static int[] reverseArrayUsingForLoop(int[] arr) {
		int [] newArray=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArray[arr.length - 1 - i] = arr[i];
		}
		return newArray;
	}
}