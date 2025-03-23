package BeginnerExample;

import java.util.Scanner;


//Calculate Sum of All Digit like 1234 sum is = 10  
//1+2+3+4=10
public class CalculateSumOfAllDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Given No for Calculate Sum ");
		Integer num=sc.nextInt();
		
		//Gavathi way
		Integer sum = calculateSumOfDigit(num);
		System.out.println("Gavathi way to Calculate sum "+sum);
		
		Integer sum1 = calculateSumOfDigitStandardWay(num);
		System.out.println("Standard Way to Calculate sum "+sum1);
	}

	private static Integer calculateSumOfDigit(Integer num) {
		String str=num.toString();
		Integer temp=0;
		for(int i=0; i <=str.length()-1; i++) {
			temp+=Character.getNumericValue(str.charAt(i));
		}
		return temp;
	}
	
	private static Integer calculateSumOfDigitStandardWay(Integer num) {
	    int sum = 0;
	    while (num > 0) {
	        sum += num % 10; // Extract last digit
	        num =num / 10; // Remove last digit
	    }
	    return sum;
	}
}
