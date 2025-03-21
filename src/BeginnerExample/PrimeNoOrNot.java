package BeginnerExample;

import java.util.Scanner;

public class PrimeNoOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Any Number ");
		int number = sc.nextInt();
		
		if(findOutPrimeNo(number)) {
			System.out.println("Given No Is "+ number +" prime no !!!");
		}else {
			System.out.println("Given No Is not "+ number +" prime no !!!");
		}
	}

	private static boolean findOutPrimeNo(int number) {
		for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true; 
	}
}
