package StringExample;

import java.util.Iterator;

//Write a Java program to count the number of words present in a string.
public class CountNoOfWordsInList {

	public static void main(String[] args) {
		String str = "I Love Java Programming!";
		
		int count1 = m1(str);
		System.out.println("Using TO Convert String to String [] "+count1);
		
		int count2 = m2(str);
		System.out.println("Using For Loop "+count2);
		
	}


	private static int m1(String str) {
		 String[] strArray = str.split(" ");
		return strArray.length;
	}
	
	private static int m2(String str) {
		int count = 0; 
		for (String word : str.split(" ")) {
			count++;
		}
		return count;
	}
	
	
}
