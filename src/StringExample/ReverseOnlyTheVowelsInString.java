package StringExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Reverse Only the Vowels in a String DSA Question 3
public class ReverseOnlyTheVowelsInString {
	public static void main(String[] args) {
		String str= "IceCreAm";
		//o/p AceCreIm;
		
		usingStream(str);
		
	}

	private static void usingStream(String str) {
		List<String> vowels = Arrays.stream(str.split(""))
		.filter(x->x.matches("[aAeEiIoOuU]"))
		.map(x->x)
		.collect(Collectors.toList());
		
//		System.out.println(vowels);
		
		String reverseVowels = "";
		for (int i = vowels.size()-1 ; i >= 0 ; i--) {
			reverseVowels=reverseVowels+vowels.get(i);
		}
		
//		System.out.println("reverseVowels: "+reverseVowels);
		
		String rs="";
		int j = 0;
		
		for(int i=0;i<str.length();i++) {
			String ch = String.valueOf(str.charAt(i));
			if(ch.matches("[aAeEiIoOuU]")){
				rs=rs+reverseVowels.charAt(j);
				j++;
			}else {
				rs+=ch;
			}
		}
		System.out.println("Original String: " + str);
	    System.out.println("Result: " + rs);
		
	}
}
