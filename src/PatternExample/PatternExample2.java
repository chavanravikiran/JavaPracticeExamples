package PatternExample;

import java.util.Scanner;

public class PatternExample2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter Number :");
		int num = sc.nextInt();
		
		simplePattern(num);
		System.out.println("Another Way to Print");
		simplePattern1(num);
	}

	private static void simplePattern(int num) {
		for(int i=0; i<num; i++) {
			for(int j=num; j>i; j--) {
				System.out.print("*"+ " ");
			}
			System.out.println("");
		}
	}
	
	private static void simplePattern1(int num) {
        for (int i = 1; i <= num; i++) {  
            for (int j = 0; j <= num - i; j++) {  
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//	 j0 j1 j2 j3
//i0 * * * * *
//i1 * * * *
//i2 * * * 
//i3 * * 
//i4 * 