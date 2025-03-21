package BeginnerExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindEvenOrOddTillEnd {
	public static void main(String[] args) {
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Any Number ");
		int number = sc.nextInt();
		
		for(int i= 1; i <=number; i++) {
			if(isEven(i)) {//even
				even.add(i);
			}else {//odd
				odd.add(i);
			}
		}
		System.out.println("Event List"+even);
		System.out.println("Odd List "+odd);
	}

	private static boolean isEven(int i) {
		if(i % 2 == 0) {
			return true;
		}
		return false;
	}
}
