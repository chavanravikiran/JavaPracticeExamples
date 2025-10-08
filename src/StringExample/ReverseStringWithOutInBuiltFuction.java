package StringExample;

//Reverse a String Without Using Built-in Reverse()
//Write a method to reverse a given string without using StringBuilder.reverse() or Collections.reverse().
public class ReverseStringWithOutInBuiltFuction {
	public static void main(String args[]){
		String str = "Ravkiran";
		
		String revString = reverse(str);
		System.out.println("reverse String is "+revString);
	}
	static String reverse(String str){
		String rev="";
		for(int i=str.length()-1; i>=0; i--){
			rev += str.charAt(i);
		}
		return rev;
	}
}
