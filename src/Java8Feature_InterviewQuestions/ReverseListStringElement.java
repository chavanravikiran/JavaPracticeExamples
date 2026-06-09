package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseListStringElement {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>(Arrays.asList("JAVA","PYTHON","CCP","RUBY"));
		
		ArrayList<String> reverseArray =new ArrayList<>();
		String str = "";
		
		for(String arr: array) {
			char[]a= arr.toCharArray();
			for(int i =a.length-1;i>=0;i--) {
				str+=a[i];
			}
			reverseArray.add(str);
			str="";
			
		}
		System.out.println(reverseArray);
	}
}
