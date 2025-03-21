package BeginnerExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindOutEvenAndOddNoSeperatly {
	public static void main(String[] args) {
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Any Number ");
		int number = sc.nextInt();
		for (int num = 1; num <= number; num++) {
			if (isPrime(num)) {
				even.add(num);
            }else {
            	odd.add(num);
            }
		}
		System.out.println("Event List"+even);
		System.out.println("Odd List "+odd);
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
