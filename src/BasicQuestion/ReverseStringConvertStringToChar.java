package BasicQuestion;

public class ReverseStringConvertStringToChar {
	public static void main(String[] args) {
		String str = "hello";
		System.out.println("Using for Loop :"+reverseStringFuction(str));
		System.out.println("Using  :"+reverseStringFuction(str));
		
	}
	
	public static String reverseStringFuction(String str) {
		String temp ="";
		for(int i=str.length()-1; i>=0;i--) {
			temp += str.charAt(i);
		}
		return temp;
	}
	
}
