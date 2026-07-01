package BasicQuestion;

import java.util.Scanner;

public class OutputTraceEx13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "Stay Inside";
		String str2 = "Stay Inside";
		String str3 = sc.nextLine();//I will enter "Stay Inside"
		
		System.out.println(str1 == str2);//True
		System.out.println(str1 == str3);//false
		
	}
}
