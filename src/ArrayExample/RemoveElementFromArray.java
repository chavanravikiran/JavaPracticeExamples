package ArrayExample;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size:");
        int size = sc.nextInt();

        System.out.println("Enter Array Elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        System.out.println("Which element do you want to remove?");
        int removeElement = sc.nextInt();

        int[] newArray = removeElement(arr, removeElement);
        System.out.println("Array after removal: " + Arrays.toString(newArray));

        sc.close();
    }

    private static int[] removeElement(int[] arr, int removeElement) {
        // Count occurrences of removeElement
        int count = 0;
        for (int value : arr) {
            if (value == removeElement) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Element not found! Returning the original array.");
            return arr; // Return original array if the element is not found
        }

        // Create a new array with reduced size
        int[] newArray = new int[arr.length - count];
        int index = 0;

        for (int value : arr) {
            if (value != removeElement) {
                newArray[index++] = value; // Copy only non-matching elements
            }
        }
        return newArray;
    }
}
