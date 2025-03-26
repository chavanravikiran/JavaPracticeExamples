package BeginnerExample;

import java.util.Scanner;

//Ravikiran  ->narikivaR
public class ReverseStringExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Original String");
		String string=sc.next();
		
		String reverseString = reverseString(string);
		System.out.println("Reverse String "+reverseString);
		
		StringBuilder sb = new StringBuilder(string);
		StringBuffer sf = new StringBuffer(string);
		System.out.println("Reverse Using String Builder Reverse Method "+sb.reverse());
		System.out.println("Reverse Using String Buffer  Reverse Method "+sf.reverse());
	}

	private static String reverseString(String string) {
		int size = string.length();
		char ch;
		String nstr = ""; 
		for(int i=0; i < size; i++) {
			ch = string.charAt(i);
			nstr = ch + nstr;
		}
		return nstr;
	}
	
	
}
