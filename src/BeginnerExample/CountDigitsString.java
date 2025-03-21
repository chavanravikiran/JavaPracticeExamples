package BeginnerExample;

import java.util.Scanner;

public class CountDigitsString {
	 public static int countDigits(int number) {
		 int count = String.valueOf(number).length();
		 System.out.println("count "+count);
	        return String.valueOf(Math.abs(number)).length(); // Convert number to string and get length
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        scanner.close();

	        System.out.println("Number of digits in " + num + " is: " + countDigits(num));
	    }
}
