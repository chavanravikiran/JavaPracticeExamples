package BeginnerExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindOutPrimeOrNormalSeperatly {
	public static void main(String[] args) {
		List<Integer> prime = new ArrayList<>();
		List<Integer> normal = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Any Number ");
		int number = sc.nextInt();
		for (int num = 1; num <= number; num++) {
			if (isPrime(num)) {
				prime.add(num);
            }else {
            	normal.add(num);
            }
		}
		System.out.println("Event List"+prime);
		System.out.println("Odd List "+normal);
	}
	
	private static boolean isPrime(int num) {
    	for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
