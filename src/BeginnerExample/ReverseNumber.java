package BeginnerExample;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Any Number ");
		Integer number = sc.nextInt();
		if(number.toString().length()>=2) {
			Integer reverge =reverseNumberMethod(number);
			System.out.println("reverge "+reverge);
		}
	}

	private static Integer reverseNumberMethod(Integer number) {
		Integer rev=0,temp;
		while(number>0) {
			temp = number % 10;//last value bhetate
			rev = rev * 10 + temp;//last chi value bhetate
			number = number / 10;//ani number madhun last digit gayab
		}
		return rev;
	}
}
