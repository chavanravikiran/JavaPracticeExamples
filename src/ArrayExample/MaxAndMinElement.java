package ArrayExample;

import java.util.Arrays;

public class MaxAndMinElement {

	public static void main(String[] args) {
		int[]arr= {1,-3,5,7,2};
		System.out.println("original array:-"+Arrays.toString(arr));
		
		findoutMinAndMaxElement(arr);
	}

	private static void findoutMinAndMaxElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
            	if(arr[i]>arr[j]) {
            		int temp=arr[i];
            		arr[i]=arr[j];
            		arr[j]=temp;
            	}
            }
        }
		System.out.println("Array is sort by Asc order:"+Arrays.toString(arr));
		System.out.println("Max Element From Array is:"+arr[arr.length - 1]);
		System.out.println("Min Element From Array is:"+arr[0]);
	}
}
