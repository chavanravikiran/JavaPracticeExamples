package StringExample;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramCheck {
	public static void main(String[] args) {
		 String s1 = "listen", s2 = "silent";
		 
		 
		 String s1Sort =Arrays.stream(s1.split(""))
			 .sorted()
			 .collect(Collectors.joining());
		 
		 String s2Sort =Arrays.stream(s2.split(""))
				 .sorted()
				 .collect(Collectors.joining());
		 
		 if(s1Sort.equals(s2Sort)) {
			 System.out.println("Given String is anagram !!");
		 }else {
			 System.out.println("Given String is not anagram !!");
		 }
		 
		 
		 ///
		 char [] ch1 = s1.toCharArray();
		 Arrays.sort(ch1);
		 String str1 = new String(ch1);
		 
		 char [] ch2 = s2.toCharArray();
		 Arrays.sort(ch2);
		 String str2 = new String(ch2);
		 
		 if(str1.equals(str2)) {
			 System.out.println("Given String is anagram !!");
		 }else {
			 System.out.println("Given String not anagram !!");
		 }
		 
	}
}
