package ArrayExample;

import java.util.Arrays;

//given an array rotate the elements in pairs of three for example given {1,2,3,4,5,6,7,8,9} and 
//result should be {3,2,1,6,5,4,9,8,7}
public class RotateInThree {
	public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < arr.length; i += 3) {
            // swap first and third element of each group
            int temp = arr[i];
            arr[i] = arr[i + 2];
            arr[i + 2] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
