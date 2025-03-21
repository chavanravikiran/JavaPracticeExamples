package BeginnerExample;

import java.util.Scanner;

//5!
//5*4*2*2*1
//=120
public class FactorialExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Any Number ");
		int number = sc.nextInt();
		
		int fact = factorial(number);
		System.out.println(fact);
	}

	private static int factorial(int number) {
		int temp=1;
		for(int i=1;  i<=number; i++) {
			temp=temp*i;
		}
		return temp;
	}
}
