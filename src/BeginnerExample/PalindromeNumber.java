package BeginnerExample;

import java.util.Scanner;


//121 ->Number is palindrome
//123 ->Number is not palindrome
public class PalindromeNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Any Number ");
		Integer number = sc.nextInt();
		Integer reverge=0;
		if(number.toString().length()>=2) {
			reverge=reverseNumberMethod(number);
			System.out.println("reverge "+reverge);
		}
		if(reverge == number) {
			System.out.println("Given no. is Palindrome");
		}else {
			System.out.println("Given no. is not Palindrome");
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
