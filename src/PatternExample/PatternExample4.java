package PatternExample;

import java.util.Scanner;

public class PatternExample4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter Number :");
		int num = sc.nextInt();
		
		simplePattern(num);
	}

	private static void simplePattern(int num) {
		for(int i=0; i<num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("-"+ " ");
			}
			for(int k=0; k<num-i; k++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
		
	}
}

//* * * * * 
//- * * * * 
//- - * * * 
//- - - * * 
//- - - - * 

