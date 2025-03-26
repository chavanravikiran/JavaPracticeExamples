package BeginnerExample;

import java.util.Scanner;

public class ReverseEachWordOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Original String");
		String string=sc.nextLine();//nextLine() -Take Line From Uses ,next()--OnlyTake Single Word
		
		String reverseString = reverseString(string);
		System.out.println("Reverse String "+reverseString);
	}
	
	private static String reverseString(String string) {
		String [] words = string.split(" ");
		
		String reverseString = "" ;
		for(int i=0; i< words.length; i++) {
			String word = words[i]; 
			char ch;
			String nstr = "";
			
			for(int j=0; j < word.length(); j++) {
				ch = word.charAt(j);
				nstr = ch + nstr;
			}
			reverseString = reverseString + nstr+ " ";
		}
		return reverseString;
	}
}
