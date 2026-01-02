package StringExample;

import java.util.Scanner;

public class ConvertIntegerToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Integer value : ");

		Integer value = sc.nextInt();
		System.out.println(value);
		
		System.out.println("Convert to Integer to String :"+value.toString());
		
	}
}
