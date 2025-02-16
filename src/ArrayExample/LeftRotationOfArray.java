package ArrayExample;

import java.util.Arrays;

public class LeftRotationOfArray {
	public static void main(String[] args) {
		String []array= {"RAVI","KIRAN","ATUL","CHAVAN"};//{"KIRAN", "ATUL", "CHAVAN", "RAVI"}
		System.out.println("Original Array"+Arrays.toString(array));
		leftRotationArray(array);
	}

	private static void leftRotationArray(String[] array) {
		String temp=array[0];
		
		for(int i = 0; i < array.length-1; i++) {
			array[i] = array[i+1];
		}
		array[array.length-1]=temp;
		System.out.println("left rotation of Array"+Arrays.toString(array));
	}
}
