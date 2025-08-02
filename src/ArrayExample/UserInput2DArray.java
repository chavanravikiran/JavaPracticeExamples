package ArrayExample;

import java.util.Scanner;

public class UserInput2DArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Take array dimensions from user
		System.out.print("Enter number of rows: ");
		int rows = scanner.nextInt();

		System.out.print("Enter number of columns: ");
		int cols = scanner.nextInt();

		// Declare 2D array
		int[][] arr = new int[rows][cols];

		// Take input for 2D array
		System.out.println("Enter elements of the array:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Element at [" + i + "][" + j + "]: ");
				arr[i][j] = scanner.nextInt();
			}
		}

		// Print the array
		System.out.println("\n2D Array:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		scanner.close();
	}
}