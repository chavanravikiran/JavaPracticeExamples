package PatternExample;

import java.util.Scanner;

public class PatternExample9 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter Number :");
		int size = sc.nextInt();
		
		simplePattern(size);
	}

	private static void simplePattern(int size) {
		for (int i = 0; i < size; i++) {
           for(int j=0; j<size; j++) {
        	   if(j==0 || j==size-1) {
        		   System.out.print("*"+" ");
        	   }else {
        		   System.out.print(" ");
        	   }
           }
           System.out.println();
        }		
	}
}
