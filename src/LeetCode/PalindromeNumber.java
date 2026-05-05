package LeetCode;

public class PalindromeNumber {
	public static void main(String[] args) {
		int number = 121;
		System.out.println(isPalindrome(number));
	}
	public static boolean isPalindrome(int number) {
		int rev = 0; 
		int original = number;
		int temp= 0;
		while(number>0) {
			temp = number % 10;
			rev = rev * 10 + temp;
			number = number /10;
		}
		
		return rev == original;
	}
}
